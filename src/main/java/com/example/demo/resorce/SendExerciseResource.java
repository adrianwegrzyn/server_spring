package com.example.demo.resorce;


import com.example.demo.model.exercises.Exercise;
import com.example.demo.model.exercises.ExercisesOnOneDay;
//import com.example.demo.model.exercises.ExercisesOnSevenDays;
//import com.example.demo.model.exercises.ExercisesOnSevenDays;
import com.example.demo.model.exercises.ExercisesOnSevenDays;
import com.example.demo.repository.exercises.ExercisesOnOneDayRepository;
//import com.example.demo.repository.exercises.ExercisesOnSevenDaysRepository;
import com.example.demo.repository.exercises.ExercisesOnSevenDaysRepository;
import javafx.scene.input.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/exercises/users")
public class SendExerciseResource {
        @Autowired
        ExercisesOnSevenDaysRepository exercisesOnSevenDaysRepository;
        @Autowired
        ExercisesOnOneDayRepository exercisesOnOneDayRepository;

    @GetMapping(value = "/show")
    public List<ExercisesOnSevenDays> showelement() {
        return exercisesOnSevenDaysRepository.findAll();
    }

//    @RequestMapping(value="/take/{query}", method = RequestMethod.GET)
//    public List<ExercisesOnOneDay> getData(@PathVariable("query") String query) {
//        String[] split = query.split(":");
//        String id = split[0];
//        String dataStart = split[1];
//        String dataEnd = split[2];
//        System.out.println("dataEnd = " + dataEnd);
//        System.out.println("dataStart = " + dataStart);
//        System.out.println("id = " + id);
//        return exercisesOnOneDayRepository.findAllByIdExerciseOneDayAndDAndDateDayBetween(Integer.parseInt(id),Date.valueOf(dataStart),Date.valueOf(dataEnd));
//
//
//    }

        @GetMapping(value = "/load")
        public List<ExercisesOnSevenDays> getAll() {
            ExercisesOnSevenDays exerciseOnSewenDays = new ExercisesOnSevenDays();
            ExercisesOnOneDay exercisesOnOneDay1 = new ExercisesOnOneDay();
            ExercisesOnOneDay exercisesOnOneDay2 = new ExercisesOnOneDay();
            ExercisesOnOneDay exercisesOnOneDay3 = new ExercisesOnOneDay();
            ExercisesOnOneDay exercisesOnOneDay4 = new ExercisesOnOneDay();
            ExercisesOnOneDay exercisesOnOneDay5 = new ExercisesOnOneDay();
            ExercisesOnOneDay exercisesOnOneDay6 = new ExercisesOnOneDay();
            ExercisesOnOneDay exercisesOnOneDay7 = new ExercisesOnOneDay();

                Exercise exercise1 = new Exercise();
                        exercise1.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
                Exercise exercise2 = new Exercise();
                        exercise2.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
                Exercise exercise3 = new Exercise();
                        exercise3.setNameExercise("martwy").setRepetitions(10).setSeries(2);
                Exercise exercise4 = new Exercise();
                        exercise4.setNameExercise("kolana").setRepetitions(8).setSeries(4);
                Exercise exercise5 = new Exercise();
                        exercise5.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);

            Exercise exercise6 = new Exercise();
            exercise6.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
            Exercise exercise7 = new Exercise();
            exercise7.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
            Exercise exercise8 = new Exercise();
            exercise8.setNameExercise("martwy").setRepetitions(10).setSeries(2);
            Exercise exercise9 = new Exercise();
            exercise9.setNameExercise("kolana").setRepetitions(8).setSeries(4);
            Exercise exercise10 = new Exercise();
            exercise10.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);

            Exercise exercise11 = new Exercise();
            exercise11.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
            Exercise exercise12 = new Exercise();
            exercise12.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
            Exercise exercise13 = new Exercise();
            exercise13.setNameExercise("martwy").setRepetitions(10).setSeries(2);
            Exercise exercise14 = new Exercise();
            exercise14.setNameExercise("kolana").setRepetitions(8).setSeries(4);
            Exercise exercise15 = new Exercise();
            exercise15.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);

            Exercise exercise16 = new Exercise();
            exercise16.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
            Exercise exercise17 = new Exercise();
            exercise17.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
            Exercise exercise18 = new Exercise();
            exercise18.setNameExercise("martwy").setRepetitions(10).setSeries(2);
            Exercise exercise19 = new Exercise();
            exercise19.setNameExercise("kolana").setRepetitions(8).setSeries(4);
            Exercise exercise20 = new Exercise();
            exercise20.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);


            Exercise exercise21 = new Exercise();
            exercise21.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
            Exercise exercise22 = new Exercise();
            exercise22.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
            Exercise exercise23 = new Exercise();
            exercise23.setNameExercise("martwy").setRepetitions(10).setSeries(2);
            Exercise exercise24 = new Exercise();
            exercise24.setNameExercise("kolana").setRepetitions(8).setSeries(4);
            Exercise exercise25 = new Exercise();
            exercise25.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);

            Exercise exercise26 = new Exercise();
            exercise26.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
            Exercise exercise27 = new Exercise();
            exercise27.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
            Exercise exercise28 = new Exercise();
            exercise28.setNameExercise("martwy").setRepetitions(10).setSeries(2);
            Exercise exercise29 = new Exercise();
            exercise29.setNameExercise("kolana").setRepetitions(8).setSeries(4);
            Exercise exercise30 = new Exercise();
            exercise30.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);


            Exercise exercise31 = new Exercise();
            exercise31.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
            Exercise exercise32 = new Exercise();
            exercise32.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
            Exercise exercise33 = new Exercise();
            exercise33.setNameExercise("martwy").setRepetitions(10).setSeries(2);
            Exercise exercise34 = new Exercise();
            exercise34.setNameExercise("kolana").setRepetitions(8).setSeries(4);
            Exercise exercise35 = new Exercise();
            exercise35.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);




            exercisesOnOneDay1.setDateDay(Date.valueOf("2018-12-21"))
                    .setExercise(Arrays.asList(exercise1,exercise2,exercise3,exercise4,exercise5));
            exercisesOnOneDay2.setDateDay(Date.valueOf("2018-12-22"))
                    .setExercise(Arrays.asList(exercise6,exercise7,exercise8,exercise9,exercise10));
            exercisesOnOneDay3.setDateDay(Date.valueOf("2018-12-23"))
                    .setExercise(Arrays.asList(exercise11,exercise12,exercise13,exercise14,exercise15));
            exercisesOnOneDay4.setDateDay(Date.valueOf("2018-12-24"))
                    .setExercise(Arrays.asList(exercise16,exercise17,exercise18,exercise19,exercise20));
            exercisesOnOneDay5.setDateDay(Date.valueOf("2018-12-25"))
                    .setExercise(Arrays.asList(exercise21,exercise22,exercise23,exercise24,exercise25));
            exercisesOnOneDay6.setDateDay(Date.valueOf("2018-12-25"))
                    .setExercise(Arrays.asList(exercise26,exercise27,exercise28,exercise29,exercise30));
            exercisesOnOneDay7.setDateDay(Date.valueOf("2018-12-26"))
                    .setExercise(Arrays.asList(exercise31,exercise32,exercise33,exercise34,exercise35));




            exerciseOnSewenDays.setDateEnd("19-1-2019").setDateStart("19-12-2018")
                    .setExercise(Arrays.asList(exercisesOnOneDay1,exercisesOnOneDay2,exercisesOnOneDay3,exercisesOnOneDay4,exercisesOnOneDay5,exercisesOnOneDay6,exercisesOnOneDay7));

            exercisesOnSevenDaysRepository.save(exerciseOnSewenDays);

            return exercisesOnSevenDaysRepository.findAll();
        }
    }

//        @PostMapping(value ="/send")
//        public List<OpinionDiet> persist(@RequestBody final OpinionDiet opinion){
//            opinionRepository.save(opinion);
//            return opinionRepository.findAll();
//        }

