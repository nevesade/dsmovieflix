package com.devnevesade.MovieFlix.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devnevesade.MovieFlix.dto.GenreDTO;
import com.devnevesade.MovieFlix.services.GenreService;

@RestController
@RequestMapping(value = "/genres")
public class GenreResource {
	
	
	@Autowired
	private GenreService service;
	
	@GetMapping
	public ResponseEntity<Page<GenreDTO>> findAll(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "12") Integer linesPerPage,
			@RequestParam(value = "direction", defaultValue = "DESC") String direction,
			@RequestParam(value = "orderBy", defaultValue = "name") String orderBy
			
			
			
			
			){
		
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		Page<GenreDTO> list = service.findAllPaged(pageRequest) ;
		return ResponseEntity.ok().body(list);
		
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<GenreDTO> findById( @PathVariable Long id){
			GenreDTO dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	

}
