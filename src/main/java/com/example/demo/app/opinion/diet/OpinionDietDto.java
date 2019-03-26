package com.example.demo.app.opinion.diet;

import java.util.Date;

public class OpinionDietDto {
    private String name;
    private Date date;
    private String message;
    private String photo;

    public OpinionDietDto() { }


    public String getPhoto() {
        return photo;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
