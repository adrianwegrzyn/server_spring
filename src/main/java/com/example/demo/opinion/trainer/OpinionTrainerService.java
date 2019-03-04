package com.example.demo.opinion.trainer;

import java.util.List;

public interface OpinionTrainerService {
    List<OpinionTrainerEntity> getAllOpinionTrainer();
    void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO);
    List<OpinionTrainerEntity> getOpinionTrainer(String userId);

}
