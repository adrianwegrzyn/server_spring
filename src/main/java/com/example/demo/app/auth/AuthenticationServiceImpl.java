package com.example.demo.app.auth;

import com.example.demo.security.jwt.JwtTokenProvider;
import com.example.demo.app.user.users.UsersEntity;
import com.example.demo.app.user.users.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.springframework.http.ResponseEntity.ok;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final JwtTokenProvider jwtTokenProvider;
    private final AuthenticationRepository authenticationRepository;
    private final UsersRepository usersRepository;

    @Autowired
    public AuthenticationServiceImpl(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, AuthenticationRepository authenticationRepository, UsersRepository usersRepository) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.authenticationRepository = authenticationRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    public ResponseEntity signin(AuthenticationRequest authenticationRequest) {
        boolean body = true;

        String username = authenticationRequest.getUsername();
        UsersEntity usersEntity = usersRepository.findByUserWhereIdBodyIsNull(username);

            if(usersEntity != null) {
                body = false;
            }

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, authenticationRequest.getPassword()));
        List<String> roles = authenticationRepository.findByUsername(username).get().getRoles();

        String token = jwtTokenProvider.createToken(username, this.authenticationRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username " + username + "not found")).getRoles());

        Map<Object, Object> model = new HashMap<>();
        model.put("username", username);
        model.put("roles",roles);
        model.put("token", token);
        model.put("body", body);
        return ok(model);
    }
}