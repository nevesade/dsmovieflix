package com.devnevesade.MovieFlix.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devnevesade.MovieFlix.dto.RoleDTO;
import com.devnevesade.MovieFlix.dto.UserDTO;
import com.devnevesade.MovieFlix.dto.UserInsertDTO;
import com.devnevesade.MovieFlix.dto.UserUpdateDTO;
import com.devnevesade.MovieFlix.entities.Role;
import com.devnevesade.MovieFlix.entities.User;
import com.devnevesade.MovieFlix.repositories.RoleRepository;
import com.devnevesade.MovieFlix.repositories.UserRepository;
import com.devnevesade.MovieFlix.services.exceptions.DatabaseException;
import com.devnevesade.MovieFlix.services.exceptions.ResourceNotFoundException;

@Service 
public class UserService implements UserDetailsService{
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	
	@Autowired
	private  BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserRepository repository;
	
	
	@Autowired
	private RoleRepository roleRepository;
	
	
	
	@Transactional(readOnly = true )
	public Page<UserDTO> findAllPaged(PageRequest pageResquest){
		Page<User> list = repository.findAll(pageResquest);
		
		return  list.map( x -> new UserDTO(x));
		
					
	}

	@Transactional(readOnly = true )
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new UserDTO(entity);
		
	}

	@Transactional
	public UserDTO insert(UserInsertDTO dto) {
		User  entity = new User();
		copyDtoToEntity(dto, entity);
		entity.setPassword(passwordEncoder.encode( dto.getPassword()));
		entity = repository.save(entity);
		return new UserDTO(entity);
	}

	
	

	@Transactional
	public UserDTO updtate(Long id, UserUpdateDTO dto) {
		try {
			User entity = repository.getOne(id);
			copyDtoToEntity(dto, entity);
			
			entity = repository.save(entity);
			return new UserDTO(entity);
		
		}
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Id not found " + id);
		}
	
	}


	public void delete(Long id) {
		try {
			repository.deleteById(id);
		
		}
		catch(EmptyResultDataAccessException e) {
			throw new  ResourceNotFoundException("Id mot Found "  + id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DatabaseException("Integrity Violation");
		}
	}
	
	private void copyDtoToEntity(UserDTO dto, User entity) {
		
	
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		
		entity.getRoles().clear();
		for (RoleDTO roleDto : dto.getRoles()) {
			Role role = roleRepository.getOne(roleDto.getId());
			entity.getRoles().add(role);
		}
		
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user  = repository.findByEmail(username);
		if(user == null) {
			logger.error("User not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		
		logger.info("User found " + username);
		return user;
	}
	
	
	
}
