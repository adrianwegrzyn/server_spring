package com.example.demo.employee;

import com.example.demo.employee.trainer.TrainerEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesServiceImpl implements EmployeesService{
    final private EmployeesRepository employeesRepository;

    @Autowired
    public EmployeesServiceImpl(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    @Override
    public List<EmployeesEntity> showEmployees() {
        return employeesRepository.findAll();
    }

    @Override
    public void addEmployee(EmployeesDto employeesDto) {
        ModelMapper modelMapper = new ModelMapper();
        EmployeesEntity employeesEntity = modelMapper.map(employeesDto, EmployeesEntity.class);
        employeesRepository.save(employeesEntity);


    }
}

