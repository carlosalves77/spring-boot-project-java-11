package com.springboot.jpa.repositories;


import com.springboot.jpa.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long> {
    

}
