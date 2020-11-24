package com.devnevesade.MovieFlix.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devnevesade.MovieFlix.dto.ReviewDTO;
import com.devnevesade.MovieFlix.services.ReviewService;

@RestController
@RequestMapping(value = "/reviews")
public class ReviewResource {
	
	@Autowired
	private ReviewService service;
	
	
	@GetMapping
	public ResponseEntity<List<ReviewDTO>> findAll(){
		
		List<ReviewDTO> list = service.findAll() ;
				
		return ResponseEntity.ok().body(list);
	}

}
