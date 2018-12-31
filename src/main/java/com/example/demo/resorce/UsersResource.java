//package com.example.demo.resorce;
//
//
//import com.example.demo.model.Users;
//import com.example.demo.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(value = "/rest/users")
//public class UsersResource {
//
//
//
//    @Autowired
//    UserRepository userRepository;
//
//
//    @GetMapping(value="/all")
//    public List<Users> getAll(){
//        return userRepository.findAll();
//    }
//
//    @GetMapping(value="/test")
//    public String getAlll(){
//        return "test";
//    }
//
//
//    @PostMapping(value ="/load")
//    public List<Users> persist(@RequestBody final Users user){
//        userRepository.save(user);
//        return userRepository.findAll();
//    }
//
//    @RequestMapping(value = "/login/{id}", method = RequestMethod.GET)
//    public String login(@PathVariable("id") int id){
//        return userRepository.getOne(id).getId() + " " + userRepository.getOne(id).getName() + " " + userRepository.getOne(id).getSalary();
//    }
//
//}
