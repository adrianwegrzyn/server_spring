package com.example.demo.user.body_measurements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/measurements")
public class BodyMeasurementsController {
    private final BodyMeasurementsService bodyMeasurementsService;

    @Autowired
    public BodyMeasurementsController(BodyMeasurementsService bodyMeasurementsService) {
        this.bodyMeasurementsService = bodyMeasurementsService;
    }

    @RequestMapping(value ="/progress/add", method = RequestMethod.POST)
    public void addNewMeasurement(@RequestBody final BodyMeasurementsDto bodyMeasurementsDto){
        bodyMeasurementsService.countProgress(bodyMeasurementsDto);

//          List<BodyMeasurementsEntity>  p = bodyMeasurementsService.countProgress(bodyMeasurementsDtos);
//          for(BodyMeasurementsEntity physique:p) {
//              bodyMeasurementsService.addNewMeasurements(physique);
//            }
//        return bodyMeasurementsRepository.findAll();

    }



}
