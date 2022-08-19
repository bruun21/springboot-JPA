package com.example.SPBJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SPBJPA.entities.Order;

//@Repository é opcional por esta classe já extender o JpaRepository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
