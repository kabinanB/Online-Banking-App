package com.banking.banking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banking.banking_app.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    
}
