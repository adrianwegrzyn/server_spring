package com.example.demo.opinion.trainer;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OpinionTrainerServiceImpl implements OpinionTrainerService {


    final private OpinionTrainerRepository opinionTrainerRepository;

    @Autowired
    public OpinionTrainerServiceImpl(OpinionTrainerRepository opinionTrainerRepository) {
        this.opinionTrainerRepository = opinionTrainerRepository;
    }

    @Override
    public List<OpinionTrainerEntity> getAllOpinionTrainer(){
        return opinionTrainerRepository.findAll();
    }

    @Override
    public void saveOpinionTrainer(OpinionTrainerDto opinionTrainerDTO) {
        ModelMapper modelMapper = new ModelMapper();
        OpinionTrainerEntity opinionTrainerEntity = modelMapper.map(opinionTrainerDTO, OpinionTrainerEntity.class);
        opinionTrainerRepository.save(opinionTrainerEntity);
    }

    @Override
    public List<OpinionTrainerEntity> getOpinionTrainer(String userId) {
        return opinionTrainerRepository.findAllByTrainerId(Integer.parseInt(userId));
    }
}
