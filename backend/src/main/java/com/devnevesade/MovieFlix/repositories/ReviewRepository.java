package com.devnevesade.MovieFlix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnevesade.MovieFlix.entities.Review;



public interface  ReviewRepository extends JpaRepository<Review, Long> {

}
