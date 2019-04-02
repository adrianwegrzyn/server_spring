package com.example.demo.app.opinion.diet;

import java.util.List;

public interface OpinionDietService {
        List<OpinionDietEntity> getAllOpinionDiet();
        void saveOpinionDiet(OpinionDietDto opinionDietDto,String username);
    }