package com.example.demo.opinion.diet;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OpinionDietServiceImpl implements OpinionDietService {

    final private OpinionDietRepository opinionDietRepository;

    @Autowired
    public OpinionDietServiceImpl(OpinionDietRepository opinionDietRepository) {
        this.opinionDietRepository = opinionDietRepository;
    }

    @Override
    public List<OpinionDietEntity> getAllOpinionDiet(){
        return opinionDietRepository.findAll();
    }

    @Override
    public void saveOpinionDiet(OpinionDietDto opinionDietDto) {
        ModelMapper modelMapper = new ModelMapper();
        OpinionDietEntity opinionDietEntity = modelMapper.map(opinionDietDto, OpinionDietEntity.class);
        opinionDietRepository.save(opinionDietEntity);
    }
}

