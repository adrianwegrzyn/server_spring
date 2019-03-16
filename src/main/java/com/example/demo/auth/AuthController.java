package com.example.demo.auth;

import com.example.demo.security.jwt.JwtTokenProvider;
import com.example.demo.user.UsersEntity;
import com.example.demo.user.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/auth")
public class AuthController {

    final
    AuthenticationManager authenticationManager;

    final
    JwtTokenProvider jwtTokenProvider;

    final
    AuthenticationRepository users;
    final

    PasswordEncoder passwordEncoder;

    @Autowired
    public AuthController(AuthenticationManager authenticationManager, JwtTokenProvider jwtTokenProvider, AuthenticationRepository users, PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.jwtTokenProvider = jwtTokenProvider;
        this.users = users;
        this.passwordEncoder = passwordEncoder;
    }

    @PostMapping("/signin")
    public ResponseEntity signin(@RequestBody AuthenticationRequest data) {

        try {
            String username = data.getUsername();
            System.out.println("Przed");
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, data.getPassword()));
            System.out.println("Po");
            String token = jwtTokenProvider.createToken(username, this.users.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Username " + username + "not found")).getRoles());

            Map<Object, Object> model = new HashMap<>();
            model.put("username", username);
            model.put("token", token);
            return ok(model);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            throw new BadCredentialsException("Invalid username/password supplied");
        }
    }
    @PostMapping("/rejestration")
    public List<AuthenticationEntity> rejestration(@RequestBody AuthenticationEntity user) {
        String password = user.getPassword();
        user.setPassword(this.passwordEncoder.encode(password));

        users.save(user);
        return users.findAll();
    }

}