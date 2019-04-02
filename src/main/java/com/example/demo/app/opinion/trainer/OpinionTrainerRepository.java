package com.example.demo.app.opinion.trainer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OpinionTrainerRepository extends JpaRepository<OpinionTrainerEntity,Integer> {
    @Query(
            value = "Select * from public.opinion_trainer where id_trainer  IN(Select id_trainer from public.employees where id_trainer=?1 )",
            nativeQuery = true
    )
    List<OpinionTrainerEntity> findAllUsersOpinion(int trainerId);
}