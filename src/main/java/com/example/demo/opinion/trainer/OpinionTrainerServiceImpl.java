package com.example.demo.opinion.trainer;

import com.example.demo.employee.EmployeesDto;
import com.example.demo.employee.EmployeesEntity;
import com.example.demo.employee.EmployeesRepository;
import com.example.demo.exception.EmployeeNoExistException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OpinionTrainerServiceImpl implements OpinionTrainerService {
    private final OpinionTrainerRepository opinionTrainerRepository;
    private final EmployeesRepository employeesRepository;

    @Autowired
    public OpinionTrainerServiceImpl(OpinionTrainerRepository opinionTrainerRepository, EmployeesRepository employeesRepository) {
        this.opinionTrainerRepository = opinionTrainerRepository;
        this.employeesRepository = employeesRepository;
    }

    @Override
    public List<OpinionTrainerEntity> getAllOpinionTrainer() {
        return opinionTrainerRepository.findAll();
    }
    
    @Override
    public void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO) throws EmployeeNoExistException {
        EmployeesEntity employeesEntity = employeesRepository.findByIdEmployee(opinionTrainerDTO.getTrainerId());
            if(employeesEntity == null) {
                throw new EmployeeNoExistException();
            }

        OpinionTrainerEntity opinionTrainerEntity = new OpinionTrainerEntity();
        opinionTrainerEntity.setDate(opinionTrainerDTO.getDate());
        opinionTrainerEntity.setMessage(opinionTrainerDTO.getMessage());
        opinionTrainerEntity.setUserId(opinionTrainerDTO.getUserId());

        employeesEntity.getTrainer().getOpinionTrainers().add(opinionTrainerEntity);
        employeesRepository.save(employeesEntity);
    }

    @Override
    public Optional<OpinionTrainerEntity> getOpinionTrainer(String userId) {
        return opinionTrainerRepository.findById(Integer.parseInt(userId));
    }

}
