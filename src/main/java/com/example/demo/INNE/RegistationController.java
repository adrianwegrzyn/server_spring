//package com.example.demo.controller;
//
//import com.example.demo.model.UsersEntity;
//import com.example.demo.INNE.NotificationServices;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.MailException;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class RegistationController {
//
//    private Logger logger = LoggerFactory.getLogger(RegistationController.class);
//    @Autowired
//    private NotificationServices notificationServices;
//    @RequestMapping("/signup")
//    public String signup(){
//        return "Please sing up for our services";
//    }
//
//    @RequestMapping("/signup-success")
//    public String signupSuccess(){
//
//        try {
//            notificationServices.sendNotificaitoin("k96.wowczuk@gmail.com");
//        }catch (MailException e){
//           logger.info("Error Emial:  " + e.getMessage());
//        }
//
//        return "Thank you for registering with us.";
//    }
//
//
//}
