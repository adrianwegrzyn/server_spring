package com.example.demo.opinion.trainer;

import java.util.List;
import java.util.Optional;

public interface OpinionTrainerService {
    List<OpinionTrainerEntity> getAllOpinionTrainer();
    void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO);
    Optional<OpinionTrainerEntity> getOpinionTrainer(String userId);

}
