package com.example.demo.app.user.body_measurements;

import com.example.demo.app.user.users.UsersEntity;
import com.example.demo.app.user.users.UsersRepository;
import com.example.demo.app.user.measurements.MeasurementsDto;
import com.example.demo.exception.BodyIsEmptyException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public void countProgress(BodyMeasurementsDto newBodyMeasurementsDto, String username) throws BodyIsEmptyException {
        double progressSize;
        ModelMapper modelMapper = new ModelMapper();
        UsersEntity usersEntity = usersRepository.findByUsername(username);

        List<MeasurementsDto> physiquesFromClient = newBodyMeasurementsDto.getMeasurements();
        BodyMeasurementsEntity convertBodyMeasurementsEntity = bodyMeasurementsRepository.findByLastMeasurement(username);
        if(convertBodyMeasurementsEntity == null){
            throw new BodyIsEmptyException();
        }

        BodyMeasurementsDto oldBodyMeasurementsDto = modelMapper.map(convertBodyMeasurementsEntity, BodyMeasurementsDto.class);

        List<MeasurementsDto> physiquesFromDatabase = oldBodyMeasurementsDto.getMeasurements();


        for (MeasurementsDto formClient : physiquesFromClient) {
            for (MeasurementsDto fromDatabase : physiquesFromDatabase) {
                if (formClient.getName().equals(fromDatabase.getName())) {
                    progressSize = fromDatabase.getSize() - formClient.getSize();
                    formClient.setProgress(progressSize * (-1));
                }
            }
        }
        BodyMeasurementsEntity bodyMeasurementsEntity = modelMapper.map(newBodyMeasurementsDto, BodyMeasurementsEntity.class);
        usersEntity.getBody().getBodyMeasurements().add(bodyMeasurementsEntity);

        usersRepository.save(usersEntity);
    }

    @Override
    public BodyMeasurementsDto getLastMeasurements(String username) {
        ModelMapper modelMapper = new ModelMapper();

        BodyMeasurementsEntity bodyMeasurementsEntity = bodyMeasurementsRepository.findByLastMeasurement(username);
        return modelMapper.map(bodyMeasurementsEntity, BodyMeasurementsDto.class);
    }

    @Override
    public List<BodyMeasurementsDto> getFiveLastMeasurements(String username) {
        ModelMapper modelMapper = new ModelMapper();

        List<BodyMeasurementsEntity> bodyMeasurementsEntity = bodyMeasurementsRepository.listMeasurements(username);
        List<BodyMeasurementsDto> bodyMeasurementsDtoList = new ArrayList<>();

            for(BodyMeasurementsEntity  b : bodyMeasurementsEntity){
                bodyMeasurementsDtoList.add( modelMapper.map(b, BodyMeasurementsDto.class));
            }
            return bodyMeasurementsDtoList;
    }
   // SELECT * FROM public.body_measurements ORDER BY date DESC, id_body_measurements DESC OFFSET 1 ROWS LIMIT 5

}
