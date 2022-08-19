package com.example.SPBJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SPBJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
