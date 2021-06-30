package com.springboot.jpa.repositories;


import com.springboot.jpa.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    

}
