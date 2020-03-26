package com.ares.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ares.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
