package com.devnevesade.MovieFlix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devnevesade.MovieFlix.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
	
	
}
