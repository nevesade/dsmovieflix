package com.devnevesade.MovieFlix.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.devnevesade.MovieFlix.entities.Role;

public interface  RoleRepository extends JpaRepository<Role, Long> {

}
