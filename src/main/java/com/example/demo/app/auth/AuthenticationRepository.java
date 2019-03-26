package com.example.demo.app.auth;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthenticationRepository extends JpaRepository<AuthenticationEntity,Long> {
   Optional<AuthenticationEntity> findByUsername(String username);
}