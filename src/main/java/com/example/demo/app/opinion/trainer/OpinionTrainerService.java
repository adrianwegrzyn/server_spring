package com.example.demo.app.opinion.trainer;

import com.example.demo.app.employee.employees.dto.ReturnAllTrainerDto;
import com.example.demo.app.opinion.trainer.dto.OpinionTrainerDto;
import com.example.demo.exception.EmployeeNoExistException;
import com.example.demo.exception.UserNoExistException;

import java.util.Optional;

public interface OpinionTrainerService {
    ReturnAllTrainerDto getAllOpinionTrainer(String userId);
    void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO, String username) throws EmployeeNoExistException, UserNoExistException;
    Optional<OpinionTrainerEntity> getOpinionTrainer(String userId);

}
