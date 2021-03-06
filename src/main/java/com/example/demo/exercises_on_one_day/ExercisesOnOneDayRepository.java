package com.example.demo.exercises_on_one_day;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface ExercisesOnOneDayRepository extends JpaRepository<ExercisesOnOneDayDAO,Integer> {
   // List <ExercisesOnAllDaysDAO> findByIdExerciseOneDayAndDAndDateDayBetween (int idUser, String dateStart,String dateEnd);

    @Query(
            value = "SELECT * from public.exercise_on_seven_days "+
                    "left join public.exercise_on_one_day eood using(id_exercise_on_seven_days)" +
                    "where id_exercise_on_seven_days = ?1 AND eood.date_day between ?2 AND  ?3",
            nativeQuery = true
    )
    List<ExercisesOnOneDayDAO> findAllByIdExerciseOneDayAndDAndDateDayBetween(int id, Date from, Date to);

}