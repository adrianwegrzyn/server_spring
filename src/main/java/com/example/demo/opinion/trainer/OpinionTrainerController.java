package com.example.demo.opinion.trainer;

import com.example.demo.exception.EmployeeNoExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/opinion")
public class OpinionTrainerController {
    private final OpinionTrainerService opinionTrainerServices;

    @Autowired
    public OpinionTrainerController(OpinionTrainerService opinionTrainerServices) {
        this.opinionTrainerServices = opinionTrainerServices;
    }

    @RequestMapping(value="/trainer/{id}", method = RequestMethod.GET)
    public Optional<OpinionTrainerEntity> getOpinionTrainer(@PathVariable("id") String id){
        return opinionTrainerServices.getOpinionTrainer(id);
    }

    @RequestMapping(value ="/trainer/send", method = RequestMethod.POST)
    public ResponseEntity sendOpinionDiet(@RequestBody final OpinionTrainerDto opinionTrainerDAO){
        try {
            opinionTrainerServices.saveOpinionTrainer(opinionTrainerDAO);
        } catch (EmployeeNoExistException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
