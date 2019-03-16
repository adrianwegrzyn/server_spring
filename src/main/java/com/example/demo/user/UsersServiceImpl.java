package com.example.demo.user;

import com.example.demo.auth.AuthenticationEntity;
import com.example.demo.auth.AuthenticationRepository;
import com.example.demo.exception.UsersServiceException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    final private UsersRepository userRepository;
    final private AuthenticationRepository authenticationRepository;
    final private PasswordEncoder passwordEncoder;

    @Autowired
    public UsersServiceImpl(UsersRepository userRepository, AuthenticationRepository authenticationRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.authenticationRepository = authenticationRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void createNewUser(UsersDto usersDto) throws UsersServiceException {
        ModelMapper modelMapper = new ModelMapper();

        if(checkExistUser(usersDto.getEmail(), usersDto.getAuthentication().getUsername())){
            throw new UsersServiceException("User exist in database");
        }

        String password = usersDto.getAuthentication().getPassword();
        usersDto.getAuthentication().setPassword(this.passwordEncoder.encode(password));
        usersDto.getAuthentication().setRoles(Collections.singletonList("ROLE_USER"));

        UsersEntity usersEntity = modelMapper.map(usersDto, UsersEntity.class);
        userRepository.save(usersEntity);
    }

    @Override
    public boolean checkExistUser(String emailUser,String username) {
        UsersEntity usersEntity = userRepository.findByEmail(emailUser);
        Optional<AuthenticationEntity> authenticationEntity = authenticationRepository.findByUsername(username);

        boolean ifExist = authenticationEntity.isPresent();
        return ifExist || usersEntity != null;
    }

    @Override
    public Optional<UsersEntity> showUser(String userId) {
        return userRepository.findById((long) Integer.parseInt(userId));
    }


}
