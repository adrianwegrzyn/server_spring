package com.example.demo.opinion.trainer;

import com.example.demo.employee.EmployeesDto;
import com.example.demo.employee.EmployeesEntity;
import com.example.demo.employee.EmployeesRepository;
import com.example.demo.employee.trainer.TrainerDto;
import com.example.demo.employee.trainer.TrainerEntity;
import org.hibernate.boot.model.source.spi.SingularAttributeSourceToOne;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OpinionTrainerServiceImpl implements OpinionTrainerService {


    private final
    OpinionTrainerRepository opinionTrainerRepository;
    private final
    EmployeesRepository employeesRepository;

    @Autowired
    public OpinionTrainerServiceImpl(OpinionTrainerRepository opinionTrainerRepository, EmployeesRepository employeesRepository) {
        this.opinionTrainerRepository = opinionTrainerRepository;
        this.employeesRepository = employeesRepository;
    }

    @Override
    public List<OpinionTrainerEntity> getAllOpinionTrainer(){
        return opinionTrainerRepository.findAll();
    }

    @Override
    public void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO) {
        ModelMapper modelMapper = new ModelMapper();
        EmployeesEntity employeesEntity = employeesRepository.findByIdEmployee(opinionTrainerDTO.getTrainerId());
        EmployeesDto employeesDto = modelMapper.map(employeesEntity, EmployeesDto.class);
        System.out.println(employeesRepository.findAll());

        List<OpinionTrainerDto> opinionTrainerDtoList = new ArrayList<>();
        if(employeesDto.getTrainer().getOpinionTrainers() == null){
            System.out.println("Tu");
            opinionTrainerDtoList.add(opinionTrainerDTO);
            employeesDto.getTrainer().setOpinionTrainers(opinionTrainerDtoList);
            System.out.println(employeesDto.getTrainer().getOpinionTrainers().get(0).getMessage());
        }else{
            System.out.println("tam");
            employeesDto.getTrainer().getOpinionTrainers().add(opinionTrainerDTO);
        }



        EmployeesEntity employeesEntity1 = modelMapper.map(employeesDto, EmployeesEntity.class);
      // System.out.println("coś jest " + employeesEntity1.getTrainer().getOpinionTrainers().get(0).getMessage());

        //employeesRepository.delete(employeesEntity);
        employeesRepository.save(employeesEntity1);
    }

    @Override
    public Optional<OpinionTrainerEntity> getOpinionTrainer(String userId) {
        return opinionTrainerRepository.findById(Integer.parseInt(userId));
    }
}
