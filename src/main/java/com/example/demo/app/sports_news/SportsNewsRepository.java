package com.example.demo.app.sports_news;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportsNewsRepository extends JpaRepository<SportsNewsEntity, Integer> {


}
