package com.example.demo.employee;


import java.util.List;

public interface EmployeesService {
    List<EmployeesEntity> showEmployees();
    void addEmployee(EmployeesDto employeesDTO);
}
