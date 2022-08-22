package com.example.SPBJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SPBJPA.entities.Category;
import com.example.SPBJPA.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
