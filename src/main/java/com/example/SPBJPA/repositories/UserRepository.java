package com.example.SPBJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SPBJPA.entities.User;

//@Repository é opcional por esta classe já extender o JpaRepository
public interface UserRepository extends JpaRepository<User, Long>{

}
