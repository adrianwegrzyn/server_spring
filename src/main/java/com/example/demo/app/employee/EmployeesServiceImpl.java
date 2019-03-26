package com.example.demo.app.employee;

import com.example.demo.app.auth.AuthenticationEntity;
import com.example.demo.app.auth.AuthenticationRepository;
import com.example.demo.exception.EmployeeNoExistException;
import com.example.demo.security.jwt.JwtTokenProvider;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeesServiceImpl implements EmployeesService{

    private final EmployeesRepository employeesRepository;
    private final AuthenticationRepository authenticationRepository;
    private final PasswordEncoder passwordEncoder;



    @Autowired
    public EmployeesServiceImpl(EmployeesRepository employeesRepository, AuthenticationRepository authenticationRepository, PasswordEncoder passwordEncoder, JwtTokenProvider filter) {
        this.employeesRepository = employeesRepository;
        this.authenticationRepository = authenticationRepository;
        this.passwordEncoder = passwordEncoder;

    }

    @Override
    public ResponseEntity showTrainer() {
        List<EmployeesEntity> employeesEntity = employeesRepository.findAll();
        List<ReturnAllTrainerDto> list = new ArrayList<>();

        for(EmployeesEntity e: employeesEntity){
                list.add(new ReturnAllTrainerDto(
                        e.getTrainer().getTrainerId(),
                        e.getFirstName(),
                        e.getLastName(),
                        e.getTrainer().getSpeciality(),
                        e.getTrainer().getPhoto())
                );
        }
        return new ResponseEntity<>(list, HttpStatus.CREATED);
    }

    @Override
    public void addEmployee(EmployeesDto employeesDto) throws EmployeeNoExistException {
        ModelMapper modelMapper = new ModelMapper();

        if(checkExistEmployee(employeesDto.getEmail(), employeesDto.getAuthentication().getUsername())){
            throw new EmployeeNoExistException("Employee exist in database");
        }

        String password = employeesDto.getAuthentication().getPassword();
        employeesDto.getAuthentication().setPassword(this.passwordEncoder.encode(password));
        employeesDto.getAuthentication().setRoles(Arrays.asList("ROLE_EMPLOYEE","ROLE_USER"));

        EmployeesEntity employeesEntity = modelMapper.map(employeesDto, EmployeesEntity.class);
        employeesRepository.save(employeesEntity);
    }

    @Override
    public boolean checkExistEmployee(String emailUser, String username) {
        EmployeesEntity employeesEntity = employeesRepository.findByEmail(emailUser);
        Optional<AuthenticationEntity> authenticationEntity = authenticationRepository.findByUsername(username);

        boolean ifExist = authenticationEntity.isPresent();
        return ifExist || employeesEntity != null;
    }



}