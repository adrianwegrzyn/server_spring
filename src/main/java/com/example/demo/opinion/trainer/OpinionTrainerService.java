package com.example.demo.opinion.trainer;

import com.example.demo.exception.EmployeeNoExistException;

import java.util.List;
import java.util.Optional;

public interface OpinionTrainerService {
    List<OpinionTrainerEntity> getAllOpinionTrainer();
    void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO) throws EmployeeNoExistException;
    Optional<OpinionTrainerEntity> getOpinionTrainer(String userId);

}
