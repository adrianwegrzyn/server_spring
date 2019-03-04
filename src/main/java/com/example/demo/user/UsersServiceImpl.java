package com.example.demo.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    final private UsersRepository userRepository;

    @Autowired
    public UsersServiceImpl(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createNewUser(UsersDto usersDto) throws UsersServiceException {
        ModelMapper modelMapper = new ModelMapper();

        if(checkExistUser(usersDto.getEmail()) != null){
            throw new UsersServiceException("User exist in database");
        }

        UsersEntity usersEntity = modelMapper.map(usersDto, UsersEntity.class);
        userRepository.save(usersEntity);
    }

    @Override
    public UsersEntity checkExistUser(String emailUser) {
        return userRepository.findByEmail(emailUser);
    }

    @Override
    public Optional<UsersEntity> showUser(String userId) {
        return userRepository.findById(Integer.parseInt(userId));
    }


}
