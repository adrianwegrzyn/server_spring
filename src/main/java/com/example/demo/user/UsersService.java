package com.example.demo.user;

import com.example.demo.exception.UsersServiceException;

import java.util.Optional;

public interface UsersService {
    void createNewUser(UsersDto users) throws UsersServiceException;
    boolean checkExistUser(String emailUser, String username);
    Optional<UsersEntity> showUser(String userId);
}
