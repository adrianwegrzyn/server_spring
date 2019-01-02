package com.example.demo.repository.exercises;


import com.example.demo.model.exercises.ExercisesOnSevenDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ExercisesOnSevenDaysRepository extends JpaRepository<ExercisesOnSevenDays,Integer> {

}