package com.example.SPBJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SPBJPA.entities.OrderItem;

//@Repository é opcional por esta classe já extender o JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
