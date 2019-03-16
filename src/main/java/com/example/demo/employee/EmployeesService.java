package com.example.demo.employee;


import com.example.demo.exception.EmployeeNoExistException;

import java.util.List;

public interface EmployeesService {
    List<EmployeesEntity> showEmployees();
    void addEmployee(EmployeesDto employeesDTO) throws EmployeeNoExistException;
    boolean checkExistEmployee(String emailUser, String username);
}
