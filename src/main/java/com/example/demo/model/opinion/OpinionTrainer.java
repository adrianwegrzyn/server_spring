package com.example.demo.model.opinion;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "opinion_trainer",schema = "public")
public class OpinionTrainer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opinion_trainer", updatable  =  false , nullable  =  false)
    private int idOpnionTrainer;

    @Column(name = "id_user")
    private int idUser;

    @Column(name = "name")
    private String name;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date ;

    @Column(name = "message")
    private String message;

    @Column(name = "photo")
    private String photo;

    @Column(name = "id_employee")
    private int idEmployee;





    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }






    public void setIdOpnionTrainer(int idOpnionTrainer) {
        this.idOpnionTrainer = idOpnionTrainer;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public String getPhoto() {
        return photo;
    }

    public OpinionTrainer(){
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



}
