package com.example.demo.app.plan.training_plan;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainingPlanServiceImpl implements TrainingPlanService {
    private final TrainingPlanRepository exercisesOnAllDaysRepository;

    @Autowired
    public TrainingPlanServiceImpl(TrainingPlanRepository exercisesOnAllDaysRepository) {
        this.exercisesOnAllDaysRepository = exercisesOnAllDaysRepository;
    }

    @Override
    public void createPlanForUser(TrainingPlanDto exercisesOnAllDaysDto) {
        ModelMapper modelMapper = new ModelMapper();
        TrainingPlanEntity exercisesOnAllDaysEntity = modelMapper.map(exercisesOnAllDaysDto, TrainingPlanEntity.class);
        exercisesOnAllDaysRepository.save(exercisesOnAllDaysEntity);
    }
}
