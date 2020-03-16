package com.ares.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ares.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
