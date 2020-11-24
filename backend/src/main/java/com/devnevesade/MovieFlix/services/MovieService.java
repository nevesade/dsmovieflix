package com.devnevesade.MovieFlix.services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devnevesade.MovieFlix.dto.MovieDTO;
import com.devnevesade.MovieFlix.entities.Movie;

import com.devnevesade.MovieFlix.repositories.MovieRepository;
import com.devnevesade.MovieFlix.services.exceptions.ResourceNotFoundException;

@Service
public class MovieService {
	



	@Autowired
	private MovieRepository repository;


	@Transactional(readOnly = true)
	public Page<MovieDTO> findAllPaged(PageRequest pageRequest){
				
		Page<Movie> list = repository.findAll(pageRequest);
	
		return list.map(x -> new MovieDTO(x));
		
		
	}
	
	@Transactional(readOnly = true )
	public MovieDTO findById(Long id) {
		Optional<Movie> obj = repository.findById(id);
		Movie entity = obj.orElseThrow(() -> new ResourceNotFoundException("Entity not found"));
		return new MovieDTO(entity,entity.getGenres(), entity.getReviews());
		
	}



}
