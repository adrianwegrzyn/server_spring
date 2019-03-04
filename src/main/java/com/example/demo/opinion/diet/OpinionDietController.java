package com.example.demo.opinion.diet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/opinion")
public class OpinionDietController {

    @Autowired
    private OpinionDietService opinionDietServices;


    @RequestMapping(value="/diet/show", method = RequestMethod.GET)
    public List<OpinionDietEntity>  getAllOpinionDiet(){
        return opinionDietServices.getAllOpinionDiet();
    }

    @RequestMapping(value="/diet/send", method = RequestMethod.POST)
    public void sendOpinionDiet(@RequestBody final OpinionDietDto opinionDietDTO){
        opinionDietServices.saveOpinionDiet(opinionDietDTO);
    }

}
