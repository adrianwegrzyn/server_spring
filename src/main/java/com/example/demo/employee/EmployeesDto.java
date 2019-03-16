package com.example.demo.employee;

import com.example.demo.auth.AuthenticationEntity;
import com.example.demo.employee.trainer.TrainerDto;

import java.util.Date;

public class EmployeesDto {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Double salary;
    private TrainerDto trainer;
    private AuthenticationEntity authenticationEntity;

    public EmployeesDto() {
    }


    public AuthenticationEntity getAuthenticationEntity() {
        return authenticationEntity;
    }

    public void setAuthenticationEntity(AuthenticationEntity authenticationEntity) {
        this.authenticationEntity = authenticationEntity;
    }

    public TrainerDto getTrainer() {
        return trainer;
    }

    public void setTrainer(TrainerDto trainer) {
        this.trainer = trainer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
