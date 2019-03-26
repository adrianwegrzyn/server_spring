package com.example.demo.app.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UsersRepository extends JpaRepository<UsersEntity,Long> {
    UsersEntity findByEmail(String email);


    @Query(
            value = "select * from public.users where authentication_entity in(Select id from public.auth where username = ?1)",
            nativeQuery = true
    )
    UsersEntity findByUsername(String username);



    @Query(
            value = "select * from public.users where id_body is null and  authentication_entity in(Select id from public.auth where username = ?1)",
            nativeQuery = true
    )
    UsersEntity findByUserWhereIdBodyIsNull(String username);
}