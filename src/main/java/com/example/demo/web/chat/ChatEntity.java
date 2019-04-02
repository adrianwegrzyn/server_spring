package com.example.demo.web.chat;

import com.example.demo.app.user.users.UsersEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ChatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chatId;
    private String message;
    private Date date;

    public ChatEntity() {
    }


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_chat")
    @JsonIgnore
    private UsersEntity usersEntity;


    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
