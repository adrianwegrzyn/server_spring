package com.example.demo.auth;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface AuthenticationService {
    ResponseEntity signin(AuthenticationRequest authenticationRequest);
}
