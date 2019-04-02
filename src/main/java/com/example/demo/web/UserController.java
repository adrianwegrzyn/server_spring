//package com.example.demo.web;
//
//import com.example.demo.web.chat.ChatMessage;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
//
//@Controller
//public class UserController {
//
//    @CrossOrigin
//    @MessageMapping("/user")
//    @SendTo("/topic/user")
//    public UserResponse getUser(User user) {
//
//        return new UserResponse("Hi " + user.getName());
//    }
//}