package com.example.demo.user;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UsersRepository extends JpaRepository<UsersEntity,Integer> {
    UsersEntity findByEmail(String email);




}