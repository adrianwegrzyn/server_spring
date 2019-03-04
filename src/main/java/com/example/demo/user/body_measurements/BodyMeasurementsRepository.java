package com.example.demo.user.body_measurements;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyMeasurementsRepository extends JpaRepository<BodyMeasurementsEntity,Integer> {
    @Query(value = "SELECT * FROM public.body_measurements  WHERE id_body = ?1 " +
                   "AND date IN(Select max(date) from public.body_measurements)",
            nativeQuery = true)
    BodyMeasurementsEntity lastMeasurement(int userID);

    @Modifying
    @Query(value = "UPDATE public.body_measurements SET id_body = ?1  where id_body is NULL ",
            nativeQuery = true
    )
   int updateIdBody(int userID);
}