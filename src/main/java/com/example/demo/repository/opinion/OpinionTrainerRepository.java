package com.example.demo.repository.opinion;


import com.example.demo.model.opinion.OpinionTrainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OpinionTrainerRepository extends JpaRepository<OpinionTrainer,Integer> {
    List<OpinionTrainer> findByIdOpnionTrainer(int id);

}