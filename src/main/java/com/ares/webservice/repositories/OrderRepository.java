package com.ares.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ares.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
