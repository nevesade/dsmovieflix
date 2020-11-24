package com.devnevesade.MovieFlix.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devnevesade.MovieFlix.dto.ReviewDTO;
import com.devnevesade.MovieFlix.entities.Review;
import com.devnevesade.MovieFlix.repositories.ReviewRepository;
import com.devnevesade.MovieFlix.services.exceptions.DatabaseException;
import com.devnevesade.MovieFlix.services.exceptions.ResourceNotFoundException;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ReviewDTO> findAllPaged(PageRequest pageRequest){
		Page<Review> list = repository.findAll(pageRequest);
		
		return  list.map( x -> new ReviewDTO(x));
	}
	
	@Transactional(readOnly = true )
	public ReviewDTO findById(Long id) {
		Optional<Review> obj = repository.findById(id);
		Review entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new ReviewDTO(entity);
		
	}
	
	
	@Transactional
	public ReviewDTO insert(ReviewDTO dto) {
		Review  entity = new Review();
		entity.setText(dto.getText());
		
		entity = repository.save(entity);
		return new ReviewDTO(entity);
	}
	
	

	@Transactional
	public ReviewDTO updtate(Long id, ReviewDTO dto) {
		try {
			Review entity = repository.getOne(id);
			entity.setText(dto.getText());
			entity = repository.save(entity);
			return new ReviewDTO(entity);
		
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
	

	

}
