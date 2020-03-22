package com.ares.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ares.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
