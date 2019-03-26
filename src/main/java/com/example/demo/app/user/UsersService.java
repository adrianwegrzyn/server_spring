package com.example.demo.app.user;

import com.example.demo.exception.UsersExistException;

import java.util.Optional;

public interface UsersService {
    void createNewUser(UsersDto users) throws UsersExistException;
    boolean checkExistUser(String emailUser, String username);
    Optional<UsersEntity> showUser(String userId);
}
