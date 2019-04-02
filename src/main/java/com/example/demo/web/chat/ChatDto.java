package com.example.demo.web.chat;

import java.util.Date;

public class ChatDto {
    private String message;
    private Date date;

    public ChatDto() {
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

