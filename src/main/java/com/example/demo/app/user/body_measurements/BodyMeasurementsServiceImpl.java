package com.example.demo.app.user.body_measurements;

import com.example.demo.app.user.UsersEntity;
import com.example.demo.app.user.UsersRepository;
import com.example.demo.app.user.measurements.MeasurementsDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BodyMeasurementsServiceImpl implements BodyMeasurementsService {
    private final BodyMeasurementsRepository bodyMeasurementsRepository;
    private final
    UsersRepository usersRepository;

    @Autowired
    public BodyMeasurementsServiceImpl(BodyMeasurementsRepository bodyMeasurementsRepository, UsersRepository usersRepository) {
        this.bodyMeasurementsRepository = bodyMeasurementsRepository;
        this.usersRepository = usersRepository;
    }

    @Override
    public void countProgress(BodyMeasurementsDto newBodyMeasurementsDto,String username) {
        Double progressSize;
        ModelMapper modelMapper = new ModelMapper();

        UsersEntity usersEntity = usersRepository.findByUsername(username);

        List<MeasurementsDto> physiquesFromClient = newBodyMeasurementsDto.getMeasurements();
        BodyMeasurementsEntity convertBodyMeasurementsEntity = bodyMeasurementsRepository.lastMeasurement(username);

        BodyMeasurementsDto oldBodyMeasurementsDto = modelMapper.map(convertBodyMeasurementsEntity, BodyMeasurementsDto.class);
        List<MeasurementsDto> physiquesFromDatabase = oldBodyMeasurementsDto.getMeasurements();

        for(MeasurementsDto formClient : physiquesFromClient){
            for(MeasurementsDto fromDatabase : physiquesFromDatabase){
                if(formClient.getName().equals(fromDatabase.getName())){
                    progressSize = fromDatabase.getSize() - formClient.getSize();
                    formClient.setProgress(progressSize);
                    System.out.println(progressSize);
                }
            }
        }

        BodyMeasurementsEntity bodyMeasurementsEntity = modelMapper.map(newBodyMeasurementsDto,BodyMeasurementsEntity.class);
        usersEntity.getBody().getBodyMeasurements().add(bodyMeasurementsEntity);

        usersRepository.save(usersEntity);

}



}
