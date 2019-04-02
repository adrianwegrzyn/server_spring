package com.example.demo.app.opinion.diet;

import java.util.Date;

public class OpinionDietDto {
    private Date date;
    private String message;


    public OpinionDietDto() { }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
