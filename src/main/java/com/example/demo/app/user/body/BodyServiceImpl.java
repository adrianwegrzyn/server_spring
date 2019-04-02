package com.example.demo.app.user.body;

import com.example.demo.app.user.users.UsersEntity;
import com.example.demo.app.user.users.UsersRepository;
import com.example.demo.exception.BodyExistException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BodyServiceImpl implements BodyService {

    private final UsersRepository usersRepository;
    private final
    BodyRepository bodyRepository;

    @Autowired
    public BodyServiceImpl(UsersRepository usersRepository, BodyRepository bodyRepository) {
        this.usersRepository = usersRepository;
        this.bodyRepository = bodyRepository;
    }

    @Override
    public void addBody(BodyDto bodyDto,String username) throws BodyExistException {
        ModelMapper modelMapper = new ModelMapper();

        UsersEntity usersEntity = usersRepository.findByUserWhereIdBodyIsNull(username);
        BodyEntity bodyEntity  = modelMapper.map(bodyDto,BodyEntity.class);


        if(usersEntity == null) {
            throw new BodyExistException();
        }

        usersEntity.setBody(bodyEntity);
        usersRepository.save(usersEntity);
    }
    @Override
    public List<BodyDto> getBody() {
        ModelMapper modelMapper = new ModelMapper();
        List<BodyEntity> bodyEntity = bodyRepository.findByUsernamee();
        List<BodyDto> bodyDtos = new ArrayList<>();
        for(BodyEntity b:bodyEntity){
            bodyDtos.add(modelMapper.map(b,BodyDto.class));
        }


        return   bodyDtos;

    }
}
