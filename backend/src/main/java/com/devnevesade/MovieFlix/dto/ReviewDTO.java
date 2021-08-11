package com.devnevesade.MovieFlix.dto;



import javax.validation.constraints.NotBlank;

import com.devnevesade.MovieFlix.entities.Review;

public class ReviewDTO {
	
	
	private Long id;
	
	@NotBlank(message = "Texto da avaliação não pode ser vazio")
	private String text;
	
	
	
	public ReviewDTO() {
		
	}

	public ReviewDTO(Long id, String text) {
		
		this.id = id;
		this.text = text;
	}
	
	public ReviewDTO(Review entity) {
		
		id = entity.getId();
		text = entity.getText();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	

}
