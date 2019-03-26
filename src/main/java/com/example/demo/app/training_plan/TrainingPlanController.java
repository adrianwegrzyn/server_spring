package com.example.demo.app.training_plan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/users/exercises")
public class TrainingPlanController {
    private final TrainingPlanService exercisesOnAllDaysService;
    private final TrainingPlanRepository exercisesOnAllDaysRepository;

    @Autowired
    public TrainingPlanController(TrainingPlanService exercisesOnAllDaysService, TrainingPlanRepository exercisesOnAllDaysRepository) {
        this.exercisesOnAllDaysService = exercisesOnAllDaysService;
        this.exercisesOnAllDaysRepository = exercisesOnAllDaysRepository;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public List<TrainingPlanEntity> createPlanForUser (@RequestBody TrainingPlanDto exercisesOnAllDaysDto ) {
        exercisesOnAllDaysService.createPlanForUser(exercisesOnAllDaysDto);
        return exercisesOnAllDaysRepository.findAll();
        }
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<TrainingPlanEntity> createPlanForUser ( ) {
        return exercisesOnAllDaysRepository.findAll();
    }
}