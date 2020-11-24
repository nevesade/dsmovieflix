package com.devnevesade.MovieFlix.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.devnevesade.MovieFlix.dto.ReviewDTO;
import com.devnevesade.MovieFlix.entities.Review;
import com.devnevesade.MovieFlix.repositories.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository repository;
	
	@Transactional(readOnly = true)
	public List<ReviewDTO> findAll(){
		List<Review> list = repository.findAll();
		
		return  list.stream().map( x -> new ReviewDTO(x)).collect(Collectors.toList());
	}

}
