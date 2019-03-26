package com.example.demo.app.opinion.diet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpinionDietRepository extends JpaRepository<OpinionDietEntity,Integer> {
}