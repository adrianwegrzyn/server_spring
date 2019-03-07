package com.example.demo.exercises_on_all_day.exercise;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExerciseRepository extends JpaRepository<ExerciseEntity,Integer> {
}