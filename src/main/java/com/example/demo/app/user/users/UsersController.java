package com.example.demo.app.user.users;

import com.example.demo.exception.UsersExistException;
import javassist.bytecode.stackmap.TypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
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

    @CrossOrigin
    @RequestMapping(value = "/show/{id}",method = RequestMethod.GET)
    public Optional<UsersEntity> getAll(@PathVariable("id") String id) {
        return usersService.showUser(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity addNewUser(@RequestBody final UsersDto usersDto) {
        Map<Object,Object> model = new HashMap<>();
        try {
            usersService.createNewUser(usersDto);
            model.put("statusCode","201");
            model.put("statusMessage","User has been added");
        } catch (UsersExistException e) {
            model.put("statusCode","409");
            model.put("statusMessage","Such user exist");
            return new ResponseEntity<>(model,HttpStatus.CONFLICT);
        }
        return new ResponseEntity<>(model,HttpStatus.CREATED);
    }





}
