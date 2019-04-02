package com.example.demo.app.user.body;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BodyRepository extends JpaRepository<BodyEntity,Integer> {

    @Query(
            value = "select * from public.body where id_body in(Select id_body from public.users where (authentication_entity in(Select id from public.auth) )) ",
            nativeQuery = true
    )
    List<BodyEntity> findByUsernamee();
}