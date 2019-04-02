package com.example.demo.app.user.body;

import com.example.demo.exception.BodyExistException;

import java.util.List;

public interface BodyService {
    void addBody(BodyDto bodyDto, String username) throws BodyExistException;

    List<BodyDto> getBody();
}
