package com.example.demo.app.opinion.trainer;

import com.example.demo.exception.EmployeeNoExistException;
import com.example.demo.exception.UserNoExistException;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

public interface OpinionTrainerService {
    ResponseEntity getAllOpinionTrainer(String userId);
    void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO,String username) throws EmployeeNoExistException, UserNoExistException;
    Optional<OpinionTrainerEntity> getOpinionTrainer(String userId);

}
