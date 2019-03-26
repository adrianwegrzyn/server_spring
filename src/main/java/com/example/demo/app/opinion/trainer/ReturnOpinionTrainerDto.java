package com.example.demo.app.opinion.trainer;

import java.util.Date;

public class ReturnOpinionTrainerDto {
    private Date date;
    private String message;
    private String photo;
    private String username;

    public ReturnOpinionTrainerDto(Date date, String message, String photo, String username) {
        this.date = date;
        this.message = message;
        this.photo = photo;
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
