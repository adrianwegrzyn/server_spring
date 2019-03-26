package com.example.demo.app.opinion.trainer;

import com.example.demo.exception.EmployeeNoExistException;
import com.example.demo.exception.UserNoExistException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/opinion")
public class OpinionTrainerController {
    private final OpinionTrainerService opinionTrainerServices;

    @Autowired
    public OpinionTrainerController(OpinionTrainerService opinionTrainerServices) {
        this.opinionTrainerServices = opinionTrainerServices;
    }

    @RequestMapping(value="/trainer/{id}", method = RequestMethod.GET)
    public ResponseEntity getOpinionTrainer(@PathVariable("id") String id){
        return opinionTrainerServices.getAllOpinionTrainer(id);
    }

    @RequestMapping(value ="/trainer/send", method = RequestMethod.POST)
    public ResponseEntity sendOpinionDiet(@AuthenticationPrincipal UserDetails userDetails, @RequestBody final OpinionTrainerDto opinionTrainerDto){
        Map<Object,Object> model = new HashMap<>();
            try {
                opinionTrainerServices.saveOpinionTrainer(opinionTrainerDto,userDetails.getUsername());
                model.put("statusCode","201");
                model.put("statusMessage","Opinion has been added");
            } catch (EmployeeNoExistException e) {
                model.put("statusCode","404");
                model.put("statusMessage","Employee not exist");
                return new ResponseEntity<>(model,HttpStatus.NOT_FOUND);
            } catch (UserNoExistException e) {
                model.put("statusCode","404");
                model.put("statusMessage","User not exist");
                return new ResponseEntity<>(model,HttpStatus.NOT_FOUND);
            }
        return new ResponseEntity<>(model,HttpStatus.CREATED);
    }

}
