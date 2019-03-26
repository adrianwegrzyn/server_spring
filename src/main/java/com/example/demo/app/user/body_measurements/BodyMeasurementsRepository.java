package com.example.demo.app.user.body_measurements;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BodyMeasurementsRepository extends JpaRepository<BodyMeasurementsEntity,Integer> {
    @Query(value = "SELECT * FROM public.body_measurements  WHERE ?1 IN (SELECT username FROM public.auth) " +
            "       AND id_body_measurements IN (SELECT MAX(id_body_measurements) FROM public.measurements)",
            nativeQuery = true)
    BodyMeasurementsEntity lastMeasurement(String username);


}