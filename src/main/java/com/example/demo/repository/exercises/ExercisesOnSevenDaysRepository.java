package com.example.demo.repository.exercises;


import com.example.demo.model.exercises.ExercisesOnOneDay;
import com.example.demo.model.exercises.ExercisesOnSevenDays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface ExercisesOnSevenDaysRepository extends JpaRepository<ExercisesOnSevenDays,Integer> {
//    @Query(
//            value = "SELECT * from public.exercise_on_seven_days eosd "+
//                    "inner join public.exercise_on_one_day eood using  (id_exercise_on_seven_days)" +
//                    "where eosd.id_exercise_on_seven_days = ?1 AND eood.date_day between ?2 AND  ?3",
//            nativeQuery = true
//    )
//    List<ExercisesOnSevenDays> go(int id, Date from, Date to);
}