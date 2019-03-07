package com.example.demo.opinion.trainer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OpinionTrainerRepository extends JpaRepository<OpinionTrainerEntity,Integer> {
//    List<OpinionTrainerEntity> findAllByTrainerId(int id);

}