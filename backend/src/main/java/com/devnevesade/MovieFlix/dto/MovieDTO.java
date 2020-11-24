package com.devnevesade.MovieFlix.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.devnevesade.MovieFlix.entities.Genre;
import com.devnevesade.MovieFlix.entities.Movie;
import com.devnevesade.MovieFlix.entities.Review;


public class MovieDTO {

	private Long id;
	private String title;
	private String subTitle;
	private Integer year;
	private String imgUrl;
	private String synopsis;

	
	
	private List<GenreDTO> genres = new ArrayList<>();
	
	private List<ReviewDTO> reviews = new ArrayList<>();


	
	

	public MovieDTO(Long id, String title, String subTitle, Integer year, String imgUrl, String synopsis) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;

	}

	public MovieDTO(Movie entity) {

		id = entity.getId();
		title = entity.getSubTitle();
		subTitle = entity.getSubTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getSynopsis();
	}

	 

	public MovieDTO(Movie entity,  Set<Genre> genres, List<Review> reviews ) {
		this(entity);
		

		genres.forEach(gen -> this.genres.add(new GenreDTO(gen)));

		reviews.forEach(rev -> this.reviews.add(new ReviewDTO(rev)));
		
			
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	
	public List<GenreDTO> getGenres() {
		return genres;
	}

	public void setGenres(List<GenreDTO> genres) {
		this.genres = genres;
	}

	public List<ReviewDTO> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewDTO> reviews) {
		this.reviews = reviews;
	}


	
}
