package com.example.demo;

import com.example.demo.app.auth.AuthenticationEntity;
import com.example.demo.app.auth.AuthenticationRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Slf4j
public class DataInitializer implements CommandLineRunner {
    private final AuthenticationRepository authenticationRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public DataInitializer(AuthenticationRepository authenticationRepository, PasswordEncoder passwordEncoder) {
        this.authenticationRepository = authenticationRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        this.authenticationRepository.save(AuthenticationEntity.builder()
                .username("admin")
                .password(this.passwordEncoder.encode("admin"))
                .roles(Arrays.asList("ROLE_USER", "ROLE_EMPLOYEE", "ROLE_ADMIN"))
                .build()
        );
    }


}
