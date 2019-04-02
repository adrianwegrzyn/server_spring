package com.example.demo.web.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller

public class ChatController {


    private final SimpMessagingTemplate template;

    @Autowired
    ChatController(SimpMessagingTemplate template){
        this.template = template;
    }
    @CrossOrigin
    @MessageMapping("/send/message")
    public void send(ChatDto chatDto){

        this.template.convertAndSend("/chat",  new SimpleDateFormat("HH:mm:ss").format(new Date())+"- "+ chatDto);
    }



}