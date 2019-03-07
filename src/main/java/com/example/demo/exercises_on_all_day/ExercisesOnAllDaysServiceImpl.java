package com.example.demo.exercises_on_all_day;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExercisesOnAllDaysServiceImpl implements ExercisesOnAllDaysService {

    private final ExercisesOnAllDaysRepository exercisesOnAllDaysRepository;

    @Autowired
    public ExercisesOnAllDaysServiceImpl(ExercisesOnAllDaysRepository exercisesOnAllDaysRepository) {
        this.exercisesOnAllDaysRepository = exercisesOnAllDaysRepository;
    }

    @Override
    public void createPlanForUser(ExercisesOnAllDaysDto exercisesOnAllDaysDto) {
        ModelMapper modelMapper = new ModelMapper();
        ExercisesOnAllDaysEntity exercisesOnAllDaysEntity = modelMapper.map(exercisesOnAllDaysDto, ExercisesOnAllDaysEntity.class);
        exercisesOnAllDaysRepository.save(exercisesOnAllDaysEntity);

    }
}
