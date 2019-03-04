package com.example.demo.exercises_on_one_day;



import com.example.demo.exercises_on_all_day.ExercisesOnAllDaysDAO;
import com.example.demo.exercises_on_all_day.ExercisesOnAllDaysRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;


@RestController
@RequestMapping(value = "/exercises/users")
public class ExercisesOnOneDayController {
    @Autowired
    ExercisesOnAllDaysRepository exercisesOnSevenDaysRepository;
    @Autowired
    ExercisesOnOneDayRepository exercisesOnOneDayRepository;

    @GetMapping(value = "/show")
    public List<ExercisesOnAllDaysDAO> getShowPlainAllDays() {
        return exercisesOnSevenDaysRepository.findAll();
    }

    @RequestMapping(value = "/take/{query}", method = RequestMethod.GET)
    public List<ExercisesOnOneDayDAO> getFlexPlain(@PathVariable("query") String query) {
        String[] split = query.split(":");
        String id = split[0];
        String dataStart = split[1];
        String dataEnd = split[2];
        System.out.println("dataEnd = " + dataEnd);
        System.out.println("dataStart = " + dataStart);
        System.out.println("id = " + id);
        return exercisesOnOneDayRepository.findAllByIdExerciseOneDayAndDAndDateDayBetween(Integer.parseInt(id), Date.valueOf(dataStart), Date.valueOf(dataEnd));


    }
}

//       ise("martwy").setRepetitions(10).setSeries(2);
//            Exercise exercise14 = ne @GetMapping(value = "/load")
//        public List<com.example.demo.exercises_on_all_day.ExercisesOnAllDaysDAO> getAll() {
//            com.example.demo.exercises_on_all_day.ExercisesOnAllDaysDAO exerciseOnSewenDays = new com.example.demo.exercises_on_all_day.ExercisesOnAllDaysDAO();
//            ExercisesOnAllDaysDAO exercisesOnOneDayDAO1 = new ExercisesOnAllDaysDAO();
//            ExercisesOnAllDaysDAO exercisesOnOneDayDAO2 = new ExercisesOnAllDaysDAO();
//            ExercisesOnAllDaysDAO exercisesOnOneDayDAO3 = new ExercisesOnAllDaysDAO();
//            ExercisesOnAllDaysDAO exercisesOnOneDayDAO4 = new ExercisesOnAllDaysDAO();
//            ExercisesOnAllDaysDAO exercisesOnOneDayDAO5 = new ExercisesOnAllDaysDAO();
//            ExercisesOnAllDaysDAO exercisesOnOneDayDAO6 = new ExercisesOnAllDaysDAO();
//            ExercisesOnAllDaysDAO exercisesOnOneDayDAO7 = new ExercisesOnAllDaysDAO();
//            Exercise exercise1 = new Exercise();
//
//                        exercise1.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//                Exercise exercise2 = new Exercise();
//                        exercise2.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//                Exercise exercise3 = new Exercise();
//                        exercise3.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//                Exercise exercise4 = new Exercise();
//                        exercise4.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//                Exercise exercise5 = new Exercise();
//                        exercise5.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//            Exercise exercise6 = new Exercise();
//            exercise6.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            Exercise exercise7 = new Exercise();
//            exercise7.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            Exercise exercise8 = new Exercise();
//            exercise8.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            Exercise exercise9 = new Exercise();
//            exercise9.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            Exercise exercise10 = new Exercise();
//            exercise10.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//            Exercise exercise11 = new Exercise();
//            exercise11.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            Exercise exercise12 = new Exercise();
//            exercise12.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            Exercise exercise13 = new Exercise();
//            exercise13.setNameExercw Exercise();
//            exercise14.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            Exercise exercise15 = new Exercise();
//            exercise15.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//            Exercise exercise16 = new Exercise();
//            exercise16.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            Exercise exercise17 = new Exercise();
//            exercise17.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            Exercise exercise18 = new Exercise();
//            exercise18.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            Exercise exercise19 = new Exercise();
//            exercise19.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            Exercise exercise20 = new Exercise();
//            exercise20.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//
//            Exercise exercise21 = new Exercise();
//            exercise21.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            Exercise exercise22 = new Exercise();
//            exercise22.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            Exercise exercise23 = new Exercise();
//            exercise23.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            Exercise exercise24 = new Exercise();
//            exercise24.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            Exercise exercise25 = new Exercise();
//            exercise25.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//            Exercise exercise26 = new Exercise();
//            exercise26.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            Exercise exercise27 = new Exercise();
//            exercise27.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            Exercise exercise28 = new Exercise();
//            exercise28.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            Exercise exercise29 = new Exercise();
//            exercise29.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            Exercise exercise30 = new Exercise();
//            exercise30.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//
//            Exercise exercise31 = new Exercise();
//            exercise31.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            Exercise exercise32 = new Exercise();
//            exercise32.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            Exercise exercise33 = new Exercise();
//            exercise33.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            Exercise exercise34 = new Exercise();
//            exercise34.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            Exercise exercise35 = new Exercise();
//            exercise35.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//
//
//
//            exercisesOnOneDayDAO1.setDateDay(Date.valueOf("2018-12-21"))
//                    .setExercise(Arrays.asList(exercise1,exercise2,exercise3,exercise4,exercise5));
//            exercisesOnOneDayDAO2.setDateDay(Date.valueOf("2018-12-22"))
//                    .setExercise(Arrays.asList(exercise6,exercise7,exercise8,exercise9,exercise10));
//            exercisesOnOneDayDAO3.setDateDay(Date.valueOf("2018-12-23"))
//                    .setExercise(Arrays.asList(exercise11,exercise12,exercise13,exercise14,exercise15));
//            exercisesOnOneDayDAO4.setDateDay(Date.valueOf("2018-12-24"))
//                    .setExercise(Arrays.asList(exercise16,exercise17,exercise18,exercise19,exercise20));
//            exercisesOnOneDayDAO5.setDateDay(Date.valueOf("2018-12-25"))
//                    .setExercise(Arrays.asList(exercise21,exercise22,exercise23,exercise24,exercise25));
//            exercisesOnOneDayDAO6.setDateDay(Date.valueOf("2018-12-25"))
//                    .setExercise(Arrays.asList(exercise26,exercise27,exercise28,exercise29,exercise30));
//            exercisesOnOneDayDAO7.setDateDay(Date.valueOf("2018-12-26"))
//                    .setExercise(Arrays.asList(exercise31,exercise32,exercise33,exercise34,exercise35));
//
//
//
//
//            exerciseOnSewenDays.setDateEnd("19-1-2019").setDateStart("19-12-2018")
//                    .setExercise(Arrays.asList(exercisesOnOneDayDAO1, exercisesOnOneDayDAO2, exercisesOnOneDayDAO3, exercisesOnOneDayDAO4, exercisesOnOneDayDAO5, exercisesOnOneDayDAO6, exercisesOnOneDayDAO7));
//
//            exercisesOnSevenDaysRepository.save(exerciseOnSewenDays);
//
//            return exercisesOnSevenDaysRepository.findAll();
//        }
//    }

//        @PostMapping(value ="/send")
//        public List<OpinionDietEntity> persist(@RequestBody final OpinionDietEntity opinion){
//            opinionRepository.save(opinion);
//            return opinionRepository.findAll();
//        }

