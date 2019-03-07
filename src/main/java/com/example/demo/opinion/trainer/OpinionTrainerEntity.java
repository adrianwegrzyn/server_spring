package com.example.demo.opinion.trainer;

import com.example.demo.employee.trainer.TrainerEntity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "opinion_trainer",schema = "public")
public class OpinionTrainerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opinion_trainer", updatable  =  false , nullable  =  false)
    private int opinionTrainerId;
    @Column(name = "id_user")
    private int userId;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;
    @Column(name = "message")
    private String message;

    @ManyToOne(fetch = FetchType.EAGER)
    private TrainerEntity trainerEntity;

    public OpinionTrainerEntity(){
    }



    public int getOpinionTrainerId() {
        return opinionTrainerId;
    }

    public void setOpinionTrainerId(int opinionTrainerId) {
        this.opinionTrainerId = opinionTrainerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public void setTrainerEntity(TrainerEntity trainerEntity) {
        this.trainerEntity = trainerEntity;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }



}
