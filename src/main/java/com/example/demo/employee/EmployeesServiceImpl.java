package com.example.demo.employee;

import com.example.demo.auth.AuthenticationEntity;
import com.example.demo.auth.AuthenticationRepository;
import com.example.demo.employee.trainer.TrainerEntity;
import com.example.demo.exception.EmployeeNoExistException;
import com.example.demo.exception.UsersServiceException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeesServiceImpl implements EmployeesService{

    private final  EmployeesRepository employeesRepository;
    private final AuthenticationRepository authenticationRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public EmployeesServiceImpl(EmployeesRepository employeesRepository, AuthenticationRepository authenticationRepository, PasswordEncoder passwordEncoder) {
        this.employeesRepository = employeesRepository;
        this.authenticationRepository = authenticationRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public List<EmployeesEntity> showEmployees() {
        return employeesRepository.findAll();
    }

    @Override
    public void addEmployee(EmployeesDto employeesDto) throws EmployeeNoExistException {
        ModelMapper modelMapper = new ModelMapper();


        if(checkExistEmployee(employeesDto.getEmail(), employeesDto.getAuthentication().getUsername())){
            throw new EmployeeNoExistException("Employee exist in database");
        }

        String password = employeesDto.getAuthentication().getPassword();
        employeesDto.getAuthentication().setPassword(this.passwordEncoder.encode(password));
        employeesDto.getAuthentication().setRoles(Collections.singletonList("ROLE_ADMIN"));


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