package com.example.demo.app.employee;

import com.example.demo.exception.EmployeeNoExistException;
import org.springframework.http.ResponseEntity;

public interface EmployeesService {
    ResponseEntity showTrainer();
    void addEmployee(EmployeesDto employeesDTO) throws EmployeeNoExistException;
    boolean checkExistEmployee(String emailUser, String username);
}
