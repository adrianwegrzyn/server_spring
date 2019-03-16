package com.example.demo.user;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UsersRepository extends JpaRepository<UsersEntity,Long> {
    UsersEntity findByEmail(String email);





}