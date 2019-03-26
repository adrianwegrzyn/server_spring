package com.example.demo.app.user.body;

import com.example.demo.exception.InvalidJwtAuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
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
    @RequestMapping(value = "/body/add", method = RequestMethod.POST)
    public ResponseEntity addBody(@AuthenticationPrincipal UserDetails userDetails,@RequestBody final BodyDto bodyDto){


            bodyService.addBody(bodyDto,userDetails.getUsername());


        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
