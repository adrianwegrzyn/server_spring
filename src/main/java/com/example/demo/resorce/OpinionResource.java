package com.example.demo.resorce;


import com.example.demo.model.Employees;
import com.example.demo.model.opinion.OpinionDiet;
import com.example.demo.model.opinion.OpinionTrainer;
import com.example.demo.repository.EmployeesRepository;
import com.example.demo.repository.opinion.OpinionDietRepository;
import com.example.demo.repository.opinion.OpinionTrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/opinion")
public class OpinionResource {

    @Autowired
    OpinionDietRepository opinionDietRepository;
    @Autowired
    EmployeesRepository employeesRepository;
    @Autowired
   OpinionTrainerRepository opinionTrainerRepository;

    @GetMapping(value="/diet/show")
    public List<OpinionDiet> getAllOpinionDiet(){
        return opinionDietRepository.findAll();
    }

    @PostMapping(value ="/diet/send")
    public List<OpinionDiet> sendOpinionDiet(@RequestBody final OpinionDiet opinion){
        opinionDietRepository.save(opinion);
        return opinionDietRepository.findAll();
    }

    @RequestMapping(value="/trainer/{id}", method = RequestMethod.GET)
    public List<Employees> getAllOpinionTrainer(@PathVariable("id") int id){
        return employeesRepository.findByIdEmployee(id);
    }

    @PostMapping(value ="/trainer/send")
    public List<OpinionTrainer> sendOpinionTrainer(@RequestBody final OpinionTrainer opinionTrainer){
        opinionTrainerRepository.save(opinionTrainer);
        return opinionTrainerRepository.findAll();
    }

}
