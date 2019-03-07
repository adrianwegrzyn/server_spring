package com.example.demo.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/employee")
public class EmployeesController {
    private final EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public List<EmployeesEntity> addEmployee(@RequestBody final EmployeesDto employeesDto){
        employeesService.addEmployee(employeesDto);
        return employeesService.showEmployees();
    }

    @RequestMapping(value="/show", method = RequestMethod.GET)
    public List<EmployeesEntity> getAllEmployees(){
        return employeesService.showEmployees();
    }

}
