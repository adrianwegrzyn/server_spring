package com.example.demo.opinion.diet;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


@Entity
@Table(name = "opinion_diet",schema = "public")
public class OpinionDietEntity {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_opinion_diet", updatable  =  false , nullable  =  false)
     private Integer idOpnionDiet;
     @Column(name = "id_user")
     private Integer idUser;
     @Column(name = "name")
     private String name;
     @Temporal(TemporalType.DATE)
     @Column(name = "date")
     private Date date ;
     @Column(name = "message")
     private String message;
     @Column(name = "photo")
     private String photo;

    public OpinionDietEntity(){}

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
