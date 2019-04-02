package com.example.demo.app.user.body;

import com.example.demo.exception.BodyExistException;
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
@RequestMapping(value = "/user")
public class BodyController {
    private final BodyService bodyService;

    @Autowired
    public BodyController(BodyService bodyService ) {
        this.bodyService = bodyService;
    }

    @CrossOrigin
    @RequestMapping(value = "/body/show",method = RequestMethod.GET)
    public List<BodyDto> getBody() {
       return bodyService.getBody();
    }

    @CrossOrigin
    @RequestMapping(value = "/body/add", method = RequestMethod.POST)
    public ResponseEntity addBody(@AuthenticationPrincipal UserDetails userDetails,@RequestBody final BodyDto bodyDto)  {
        Map<Object,Object> model = new HashMap<>();
        if(userDetails == null){
            model.put("statusCode","500");
            model.put("statusMessage","Username in token not exist");
            return new ResponseEntity<>(model,HttpStatus.INTERNAL_SERVER_ERROR);
        }
        try {
            bodyService.addBody(bodyDto,userDetails.getUsername());
            model.put("statusCode","201");
            model.put("statusMessage","Progress has been added");
            return new ResponseEntity<>(model,HttpStatus.CREATED);
        } catch (BodyExistException e) {
            model.put("statusCode", "409");
            model.put("statusMessage", "Body already exist");
            return new ResponseEntity<>(model,HttpStatus.CONFLICT);
        }


    }
}
