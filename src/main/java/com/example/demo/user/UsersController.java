package com.example.demo.user;

import javassist.bytecode.stackmap.TypeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/user")
public class UsersController {

    private static final Logger LOGGER = Logger.getLogger( TypeData.ClassName.class.getName() );
    private final UsersService usersService;

    @Autowired
    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(value="/show/{id}")
    public Optional<UsersEntity> getAll(@PathVariable("id") String id){
        return usersService.showUser(id);
    }

    @RequestMapping(value ="/add",method = RequestMethod.POST)
    public ResponseEntity addNewUser(@RequestBody final UsersDto usersDto){
        try {
            usersService.createNewUser(usersDto);
        } catch (UsersServiceException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
}

//
//    //add new progress users
//
//    @RequestMapping(value ="/progress/add",method = RequestMethod.POST)
//    public List<BodyMeasurementsEntity> persist(@RequestBody final List<BodyMeasurementsEntity> physiqueProgress){
//          List<BodyMeasurementsEntity>  p = physiqueService.countProgress(physiqueProgress,bodyMeasurementsRepository.listPhysiques(1));
//          for(BodyMeasurementsEntity physique:p) {
//              bodyMeasurementsService.addNewMeasurements(physique);
//            }
//        return bodyMeasurementsRepository.findAll();
//
//    }
//
//    @RequestMapping(value ="/progress/addd",method = RequestMethod.POST)
//    public List<BodyMeasurementsEntity> persistt(@RequestBody final BodyMeasurementsEntity physiqueProgress){
//
//        return  bodyMeasurementsService.addNewMeasurements(physiqueProgress);
//
//    }



//    @RequestMapping(value = "/check/email/{email}",method = RequestMethod.POST)
//    public String checkExistEmailInDatabase(@PathVariable("email") String email){
//        if(userRepository.findAllByEMail(email).isEmpty()){
//            return "false";
//        }else {
//            return "true";
//        }
//    }
//    @RequestMapping(value = "/check/login/{pass}",method = RequestMethod.POST)
//    public String checkLoginToDatabase(@PathVariable("pass") String pass){
//        String[] split = pass.split(":");
//        String email = split[0];
//        String password = split[1];
//        if(userRepository.findByEMailAndPassword(email,password).isEmpty()){
//            return "false";
//        }else {
//            return "true";
//        }
//    }


//
//    //Show all users
//    @GetMapping(value="/progress/show/{idUser}")
//    public List<HistoryOfProgress> getAll(@PathVariable("idUser") int idUser){
//        return historyOfProgressRepository.findByIdUser(idUser);
//    }




//    @RequestMapping(value = "/login/{id}", method = RequestMethod.GET)
//    public String login(@PathVariable("id") int id){
//        return userRepository.getOne(id).getId() + " " + userRepository.getOne(id).getName() + " " + userRepository.getOne(id).getSalary();
//    }

}
