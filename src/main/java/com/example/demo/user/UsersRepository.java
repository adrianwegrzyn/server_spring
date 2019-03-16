package com.example.demo.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity,Long> {
    UsersEntity findByEmail(String email);






}