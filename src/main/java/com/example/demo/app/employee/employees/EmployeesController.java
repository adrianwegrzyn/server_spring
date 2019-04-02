package com.example.demo.app.employee.employees;

import com.example.demo.app.employee.employees.dto.EmployeesDto;
import com.example.demo.exception.EmployeeNoExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee")
public class EmployeesController {
    private final EmployeesService employeesService;

    @Autowired
    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    public ResponseEntity addEmployee(@RequestBody final EmployeesDto employeesDto) {
        try {
            employeesService.addEmployee(employeesDto);
        } catch (EmployeeNoExistException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @RequestMapping(value="/trainer/show", method = RequestMethod.GET)
    public ResponseEntity getAllEmployees(){
        return employeesService.showTrainer();
    }

}
