package com.example.demo.app.opinion.trainer;

import com.example.demo.app.employee.employees.EmployeesEntity;
import com.example.demo.app.employee.employees.EmployeesRepository;
import com.example.demo.app.employee.employees.dto.ReturnAllTrainerDto;
import com.example.demo.app.opinion.trainer.dto.OpinionTrainerDto;
import com.example.demo.app.opinion.trainer.dto.ReturnOpinionTrainerDto;
import com.example.demo.exception.EmployeeNoExistException;
import com.example.demo.exception.UserNoExistException;
import com.example.demo.app.user.users.UsersEntity;
import com.example.demo.app.user.users.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OpinionTrainerServiceImpl implements OpinionTrainerService {
    private final OpinionTrainerRepository opinionTrainerRepository;
    private final EmployeesRepository employeesRepository;
    private final UsersRepository usersRepository;

    @Autowired
    public OpinionTrainerServiceImpl(OpinionTrainerRepository opinionTrainerRepository, EmployeesRepository employeesRepository, UsersRepository usersRepository) {
        this.opinionTrainerRepository = opinionTrainerRepository;
        this.employeesRepository = employeesRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    public ReturnAllTrainerDto getAllOpinionTrainer(String trainerId) {
        List<OpinionTrainerEntity> opinionTrainerEntity = opinionTrainerRepository.findAllUsersOpinion(Integer.parseInt(trainerId));
        EmployeesEntity e = employeesRepository.findByIdEmployee(Integer.parseInt(trainerId));
        List<ReturnOpinionTrainerDto> list = new ArrayList<>();

            for (OpinionTrainerEntity o : opinionTrainerEntity) {
                list.add(new ReturnOpinionTrainerDto(
                        o.getDate(),
                        o.getMessage(),
                        o.getUsersEntity().getPhoto(),
                        o.getUsersEntity().getAuthenticationEntity().getUsername())
                );
            }

        ReturnAllTrainerDto returnOpinionTrainerDto = new ReturnAllTrainerDto(
                e.getTrainer().getTrainerId(),
                e.getFirstName(),
                e.getLastName(),
                e.getTrainer().getSpeciality(),
                e.getTrainer().getPhoto(),
                list
        );
        return returnOpinionTrainerDto;
    }

    @Override
    public void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO, String username) throws EmployeeNoExistException, UserNoExistException {
        UsersEntity usersEntity = usersRepository.findByUsername(username);
        EmployeesEntity employeesEntity = employeesRepository.findByIdEmployee(opinionTrainerDTO.getTrainerId());

        if (employeesEntity == null) {
            throw new EmployeeNoExistException("Employee not exist");
        }else if(usersEntity == null){
            throw new UserNoExistException("User not exist");
        }

        OpinionTrainerEntity opinionTrainerEntity = new OpinionTrainerEntity();
        opinionTrainerEntity.setDate(opinionTrainerDTO.getDate());
        opinionTrainerEntity.setMessage(opinionTrainerDTO.getMessage());

        opinionTrainerEntity.setUsersEntity(usersEntity);

        employeesEntity.getTrainer().getOpinionTrainers().add(opinionTrainerEntity);
        employeesRepository.save(employeesEntity);

    }

    @Override
    public Optional<OpinionTrainerEntity> getOpinionTrainer(String userId) {
        return opinionTrainerRepository.findById(Integer.parseInt(userId));
    }

}
