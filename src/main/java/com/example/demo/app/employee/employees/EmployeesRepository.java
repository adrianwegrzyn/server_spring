package com.example.demo.app.employee.employees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity,Integer> {
        EmployeesEntity findByIdEmployee(int trainerId);
        EmployeesEntity findByEmail(String emailUser);
}