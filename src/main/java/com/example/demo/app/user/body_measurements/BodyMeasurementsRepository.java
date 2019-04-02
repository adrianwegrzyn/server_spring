package com.example.demo.app.user.body_measurements;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BodyMeasurementsRepository extends JpaRepository<BodyMeasurementsEntity,Integer> {
    @Query(value = "SELECT * FROM public.body_measurements  WHERE ?1 IN (SELECT username FROM public.auth) " +
            "       AND id_body_measurements IN (SELECT MAX(id_body_measurements) FROM public.measurements)",
            nativeQuery = true)
    BodyMeasurementsEntity findByLastMeasurement(String username);



    @Query(value = "SELECT * FROM public.body_measurements where id_body " +
                   "IN(Select id_body from public.users where authentication_entity " +
                   "IN(select id from public.auth where  username= ?1)) " +
                   "ORDER BY date DESC, id_body_measurements DESC OFFSET 1 ROWS LIMIT 5 ",
            nativeQuery = true)
    List<BodyMeasurementsEntity> listMeasurements(String username);
}