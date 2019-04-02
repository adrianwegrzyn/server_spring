package com.example.demo.app.user.body_measurements;

import com.example.demo.exception.BodyIsEmptyException;
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
@RequestMapping(value = "/measurements")
public class BodyMeasurementsController {
    private final BodyMeasurementsService bodyMeasurementsService;

    @Autowired
    public BodyMeasurementsController(BodyMeasurementsService bodyMeasurementsService) {
        this.bodyMeasurementsService = bodyMeasurementsService;
    }

    @CrossOrigin
    @RequestMapping(value = "/last/one/show",method = RequestMethod.GET)
    public ResponseEntity getLastProgress(@AuthenticationPrincipal UserDetails userDetails) {
        BodyMeasurementsDto bodyMeasurementsDto = bodyMeasurementsService.getLastMeasurements(userDetails.getUsername());
        return new ResponseEntity<>(bodyMeasurementsDto, HttpStatus.CREATED);
    }

    @CrossOrigin
    @RequestMapping(value = "/last/five/show",method = RequestMethod.GET)
    public ResponseEntity getFiveLastProgress(@AuthenticationPrincipal UserDetails userDetails) {
        List<BodyMeasurementsDto> bodyMeasurementsDto = bodyMeasurementsService.getFiveLastMeasurements(userDetails.getUsername());
        return new ResponseEntity<>(bodyMeasurementsDto, HttpStatus.CREATED);
    }

    @CrossOrigin
    @RequestMapping(value ="/progress/add", method = RequestMethod.POST)
    public ResponseEntity addNewMeasurement(@AuthenticationPrincipal UserDetails userDetails, @RequestBody final BodyMeasurementsDto bodyMeasurementsDto){
        Map<Object,Object> model = new HashMap<>();
        try {
            bodyMeasurementsService.countProgress(bodyMeasurementsDto, userDetails.getUsername());
            model.put("statusCode","201");
            model.put("statusMessage","Progress has been added");
        } catch (BodyIsEmptyException e) {
            model.put("statusCode","400");
            model.put("statusMessage","Body does not exist");
            return new ResponseEntity<>(model, HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(model, HttpStatus.CREATED);
}



}
