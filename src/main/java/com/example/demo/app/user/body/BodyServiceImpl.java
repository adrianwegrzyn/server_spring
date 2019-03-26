package com.example.demo.app.user.body;

import com.example.demo.app.user.UsersEntity;
import com.example.demo.app.user.UsersRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BodyServiceImpl implements BodyService {

    private final UsersRepository usersRepository;

    @Autowired
    public BodyServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public void addBody(BodyDto bodyDto,String username) {
        ModelMapper modelMapper = new ModelMapper();

        UsersEntity usersEntity = usersRepository.findByUserWhereIdBodyIsNull(username);
        BodyEntity bodyEntity  = modelMapper.map(bodyDto,BodyEntity.class);

        usersEntity.setBody(bodyEntity);
        usersRepository.save(usersEntity);
    }
}
