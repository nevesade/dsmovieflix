package com.devnevesade.MovieFlix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnevesade.MovieFlix.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
