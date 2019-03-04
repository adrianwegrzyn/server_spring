package com.example.demo.user;

import java.util.Optional;

public interface UsersService {
    void createNewUser(UsersDto users) throws UsersServiceException;
    UsersEntity checkExistUser(String emailUser);
    Optional<UsersEntity> showUser(String userId);
}
