package com.example.demo.opinion.trainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public void sendOpinionDiet(@RequestBody final OpinionTrainerDto opinionTrainerDAO){
        opinionTrainerServices.saveOpinionTrainer(opinionTrainerDAO);
    }

}
