package com.example.demo.app.opinion.diet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/opinion")
public class OpinionDietController {
    private final OpinionDietService opinionDietServices;

    @Autowired
    public OpinionDietController(OpinionDietService opinionDietServices) {
        this.opinionDietServices = opinionDietServices;
    }

    @RequestMapping(value="/diet/show", method = RequestMethod.GET)
    public List<OpinionDietEntity> getAllOpinionDiet(){
        return opinionDietServices.getAllOpinionDiet();
    }

    @RequestMapping(value = "/diet/send", method = RequestMethod.POST)
    public ResponseEntity sendOpinionDiet(@AuthenticationPrincipal UserDetails userDetails, @RequestBody final OpinionDietDto opinionDietDto) {
        Map<Object, Object> model = new HashMap<>();
        opinionDietServices.saveOpinionDiet(opinionDietDto, userDetails.getUsername());
        model.put("statusCode", "201");
        model.put("statusMessage", "Opinion has been added");
        return new ResponseEntity<>(model, HttpStatus.CREATED);
    }

}
