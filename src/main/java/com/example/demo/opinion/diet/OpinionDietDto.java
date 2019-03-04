package com.example.demo.opinion.diet;

import java.util.Date;

public class OpinionDietDto {

    private Integer idOpnionDiet;
    private Integer idUser;
    private String name;
    private Date date ;
    private String message;
    private String photo;
    public OpinionDietDto(){}

    public Integer getIdUser() {
        return idUser;
    }

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

    public Integer getIdOpnionDiet() {
        return idOpnionDiet;
    }


}
