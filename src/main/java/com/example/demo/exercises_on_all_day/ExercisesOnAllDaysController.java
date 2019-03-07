package com.example.demo.exercises_on_all_day;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/users/exercises")
public class ExercisesOnAllDaysController {
    private final ExercisesOnAllDaysService exercisesOnAllDaysService;
    @Autowired
    ExercisesOnAllDaysRepository exercisesOnAllDaysRepository;

    @Autowired
    public ExercisesOnAllDaysController(ExercisesOnAllDaysService exercisesOnAllDaysService) {
        this.exercisesOnAllDaysService = exercisesOnAllDaysService;
    }


//    @GetMapping(value = "/show")
//    public List<ExercisesOnAllDaysEntity> getShowPlainAllDays() {
//        return exercisesOnSevenDaysRepository.findAll();
//    }
//
//    @RequestMapping(value = "/take/{query}", method = RequestMethod.GET)
//    public List<ExercisesOnOneDayEntity> getFlexPlain(@PathVariable("query") String query) {
//        String[] split = query.split(":");
//        String id = split[0];
//        String dataStart = split[1];
//        String dataEnd = split[2];
//        System.out.println("dataEnd = " + dataEnd);
//        System.out.println("dataStart = " + dataStart);
//        System.out.println("id = " + id);
//        return exercisesOnOneDayRepository.findAllByIdExerciseOneDayAndDAndDateDayBetween(Integer.parseInt(id), Date.valueOf(dataStart), Date.valueOf(dataEnd));
//
//
//    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public List<ExercisesOnAllDaysEntity> createPlanForUser (@RequestBody ExercisesOnAllDaysDto exercisesOnAllDaysDto ) {
        exercisesOnAllDaysService.createPlanForUser(exercisesOnAllDaysDto);
        return exercisesOnAllDaysRepository.findAll();
    }



}




//       ise("martwy").setRepetitions(10).setSeries(2);
//            ExerciseDto exercise14 = ne @GetMapping(value = "/load")
//        public List<com.example.demo.exercises_on_all_day.ExercisesOnAllDaysEntity> getAll() {
//            com.example.demo.exercises_on_all_day.ExercisesOnAllDaysEntity exerciseOnSewenDays = new com.example.demo.exercises_on_all_day.ExercisesOnAllDaysEntity();
//            ExercisesOnAllDaysEntity exercisesOnOneDayDAO1 = new ExercisesOnAllDaysEntity();
//            ExercisesOnAllDaysEntity exercisesOnOneDayDAO2 = new ExercisesOnAllDaysEntity();
//            ExercisesOnAllDaysEntity exercisesOnOneDayDAO3 = new ExercisesOnAllDaysEntity();
//            ExercisesOnAllDaysEntity exercisesOnOneDayDAO4 = new ExercisesOnAllDaysEntity();
//            ExercisesOnAllDaysEntity exercisesOnOneDayDAO5 = new ExercisesOnAllDaysEntity();
//            ExercisesOnAllDaysEntity exercisesOnOneDayDAO6 = new ExercisesOnAllDaysEntity();
//            ExercisesOnAllDaysEntity exercisesOnOneDayDAO7 = new ExercisesOnAllDaysEntity();
//            ExerciseDto exercise1 = new ExerciseDto();
//
//                        exercise1.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//                ExerciseDto exercise2 = new ExerciseDto();
//                        exercise2.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//                ExerciseDto exercise3 = new ExerciseDto();
//                        exercise3.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//                ExerciseDto exercise4 = new ExerciseDto();
//                        exercise4.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//                ExerciseDto exercise5 = new ExerciseDto();
//                        exercise5.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//            ExerciseDto exercise6 = new ExerciseDto();
//            exercise6.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            ExerciseDto exercise7 = new ExerciseDto();
//            exercise7.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            ExerciseDto exercise8 = new ExerciseDto();
//            exercise8.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            ExerciseDto exercise9 = new ExerciseDto();
//            exercise9.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            ExerciseDto exercise10 = new ExerciseDto();
//            exercise10.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//            ExerciseDto exercise11 = new ExerciseDto();
//            exercise11.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            ExerciseDto exercise12 = new ExerciseDto();
//            exercise12.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            ExerciseDto exercise13 = new ExerciseDto();
//            exercise13.setNameExercw ExerciseDto();
//            exercise14.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            ExerciseDto exercise15 = new ExerciseDto();
//            exercise15.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//            ExerciseDto exercise16 = new ExerciseDto();
//            exercise16.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            ExerciseDto exercise17 = new ExerciseDto();
//            exercise17.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            ExerciseDto exercise18 = new ExerciseDto();
//            exercise18.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            ExerciseDto exercise19 = new ExerciseDto();
//            exercise19.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            ExerciseDto exercise20 = new ExerciseDto();
//            exercise20.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//
//            ExerciseDto exercise21 = new ExerciseDto();
//            exercise21.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            ExerciseDto exercise22 = new ExerciseDto();
//            exercise22.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            ExerciseDto exercise23 = new ExerciseDto();
//            exercise23.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            ExerciseDto exercise24 = new ExerciseDto();
//            exercise24.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            ExerciseDto exercise25 = new ExerciseDto();
//            exercise25.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//            ExerciseDto exercise26 = new ExerciseDto();
//            exercise26.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            ExerciseDto exercise27 = new ExerciseDto();
//            exercise27.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            ExerciseDto exercise28 = new ExerciseDto();
//            exercise28.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            ExerciseDto exercise29 = new ExerciseDto();
//            exercise29.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            ExerciseDto exercise30 = new ExerciseDto();
//            exercise30.setNameExercise("podciaganie").setRepetitions(12).setSeries(3);
//
//
//            ExerciseDto exercise31 = new ExerciseDto();
//            exercise31.setNameExercise("brzuszki").setRepetitions(20).setSeries(3);
//            ExerciseDto exercise32 = new ExerciseDto();
//            exercise32.setNameExercise("przysiady").setRepetitions(12).setSeries(5);
//            ExerciseDto exercise33 = new ExerciseDto();
//            exercise33.setNameExercise("martwy").setRepetitions(10).setSeries(2);
//            ExerciseDto exercise34 = new ExerciseDto();
//            exercise34.setNameExercise("kolana").setRepetitions(8).setSeries(4);
//            ExerciseDto exercise35 = new ExerciseDto();
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

