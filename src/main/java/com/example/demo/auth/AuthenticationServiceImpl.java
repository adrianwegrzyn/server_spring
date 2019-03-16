package com.example.demo.auth;

import com.example.demo.security.jwt.JwtTokenProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.http.ResponseEntity.ok;
@Service
public class AuthenticationServiceImpl implements AuthenticationService {

    private final
    AuthenticationManager authenticationManager;

    private final
    JwtTokenProvider jwtTokenProvider;

    private final
    AuthenticationRepository authenticationRepository;

    @Autowired
    public AuthenticationServiceImpl(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, AuthenticationRepository authenticationRepository) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.authenticationRepository = authenticationRepository;
    }

    @Override
    public ResponseEntity signin(AuthenticationRequest authenticationRequest) {

        String username = authenticationRequest.getUsername();
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, authenticationRequest.getPassword()));
        String token = jwtTokenProvider.createToken(username, this.authenticationRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username " + username + "not found")).getRoles());

        Map<Object, Object> model = new HashMap<>();
        model.put("username", username);
        model.put("token", token);
        return ok(model);

    }
}
