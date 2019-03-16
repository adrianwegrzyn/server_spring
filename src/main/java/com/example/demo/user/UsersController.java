package com.example.demo.user;

import com.example.demo.exception.UsersServiceException;
import javassist.bytecode.stackmap.TypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/user")
public class UsersController {

    private static final Logger LOGGER = Logger.getLogger(TypeData.ClassName.class.getName());
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(value = "/show/{id}")
    public Optional<UsersEntity> getAll(@PathVariable("id") String id) {
        return usersService.showUser(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity addNewUser(@RequestBody final UsersDto usersDto) {
        try {
            usersService.createNewUser(usersDto);
        } catch (UsersServiceException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
