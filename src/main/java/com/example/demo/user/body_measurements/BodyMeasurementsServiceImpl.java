package com.example.demo.user.body_measurements;

import com.example.demo.user.physique.PhysiqueDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class BodyMeasurementsServiceImpl implements BodyMeasurementsService {

    private final BodyMeasurementsRepository bodyMeasurementsRepository;

    @Autowired
    public BodyMeasurementsServiceImpl(BodyMeasurementsRepository bodyMeasurementsRepository) {
        this.bodyMeasurementsRepository = bodyMeasurementsRepository;
    }

    @Override
    @Transactional
    public void countProgress(BodyMeasurementsDto newBodyMeasurementsDto) {
        Double progressSize;
        ModelMapper modelMapper = new ModelMapper();

        List<PhysiqueDto> physiquesFromClient = newBodyMeasurementsDto.getPhysiques();
        BodyMeasurementsEntity convertBodyMeasurementsEntity = bodyMeasurementsRepository.lastMeasurement(newBodyMeasurementsDto.getIdUser());

        BodyMeasurementsDto oldBodyMeasurementsDto = modelMapper.map(convertBodyMeasurementsEntity, BodyMeasurementsDto.class);
        List<PhysiqueDto> physiquesFromDatabase = oldBodyMeasurementsDto.getPhysiques();

        for(PhysiqueDto formClient : physiquesFromClient){
            for(PhysiqueDto fromDatabase : physiquesFromDatabase){
                if(formClient.getName().equals(fromDatabase.getName())){
                    progressSize = fromDatabase.getSize() - formClient.getSize();
                    formClient.setProgres(progressSize);
                }
            }
        }

        BodyMeasurementsEntity bodyMeasurementsEntity = modelMapper.map(newBodyMeasurementsDto,BodyMeasurementsEntity.class);
        bodyMeasurementsRepository.save(bodyMeasurementsEntity);

        updateNullUser(newBodyMeasurementsDto.getIdUser());
    }

    @Transactional
    public void updateNullUser(int userID) {
        bodyMeasurementsRepository.updateIdBody(userID);

    }

}
