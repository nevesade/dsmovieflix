package com.devnevesade.MovieFlix.repositories;







import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devnevesade.MovieFlix.entities.Genre;
import com.devnevesade.MovieFlix.entities.Movie;

public interface  MovieRepository extends  JpaRepository<Movie, Long>  {

	
	@Query("SELECT  DISTINCT  obj FROM Movie obj INNER JOIN obj.genres  gens WHERE "
			+ "(:genre IS NULL OR  :genre IN gens)")
	Page<Movie> find(Genre genre, Pageable pageable);
	


	


}
