package com.springboot.jpa.repositories;

import com.springboot.jpa.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    

}
