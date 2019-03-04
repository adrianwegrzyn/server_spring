package com.example.demo.opinion.diet;

import java.util.List;

public interface OpinionDietService {
        List<OpinionDietEntity> getAllOpinionDiet();
        void saveOpinionDiet(OpinionDietDto opinionDietDTOS);
    }