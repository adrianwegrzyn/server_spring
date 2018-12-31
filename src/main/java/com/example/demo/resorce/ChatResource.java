package com.example.demo.resorce;


import com.example.demo.model.Chat;
import com.example.demo.repository.ChatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class ChatResource {
    @Autowired
    ChatRepository chatRepository;


    @GetMapping(value="/alll")
    public List<Chat> getAll(){
        return chatRepository.findAll();
    }

    @PostMapping(value ="/loadd")
    public List<Chat> persist(@RequestBody final Chat chat){

        chatRepository.save(chat);
        return chatRepository.findAll();
    }




}
