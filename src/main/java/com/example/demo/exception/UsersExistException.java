package com.example.demo.exception;

public class UsersExistException extends Throwable {
    public UsersExistException(String message) {
        super(message);
    }
}
