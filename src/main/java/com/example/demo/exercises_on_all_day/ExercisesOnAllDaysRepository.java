package com.example.demo.exercises_on_all_day;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ExercisesOnAllDaysRepository extends JpaRepository<ExercisesOnAllDaysDAO,Integer> {

}