package com.example.demo.auth;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthenticationRepository extends JpaRepository<AuthenticationEntity,Long> {
   Optional<AuthenticationEntity> findByUsername(String username);




}