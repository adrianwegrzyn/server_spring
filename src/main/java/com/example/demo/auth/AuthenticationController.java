package com.example.demo.auth;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.BadCredentialsException;

import org.springframework.security.core.AuthenticationException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import java.util.Map;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {

    private final
    AuthenticationService authenticationService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    @PostMapping("/signin")
    public ResponseEntity signin(@RequestBody AuthenticationRequest data) {


        try {
            return authenticationService.signin(data);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new BadCredentialsException("Invalid username/password supplied");
        }
    }


}