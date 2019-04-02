package com.example.demo.app.auth;

import org.springframework.http.ResponseEntity;

public interface AuthenticationService {
    ResponseEntity signin(AuthenticationRequest authenticationRequest);
}
