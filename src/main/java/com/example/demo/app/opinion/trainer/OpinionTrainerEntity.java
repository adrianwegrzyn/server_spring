package com.example.demo.app.opinion.trainer;

import com.example.demo.app.employee.trainer.TrainerEntity;
import com.example.demo.app.user.users.UsersEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "opinion_trainer",schema = "public")
public class OpinionTrainerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opinion_trainer", updatable  =  false , nullable  =  false)
    private int opinionTrainerId;

    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;
    @Column(name = "message")
    private String message;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_trainer")
    private TrainerEntity trainerEntity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    @JsonIgnore
    private UsersEntity usersEntity;

    public OpinionTrainerEntity(){}
    public UsersEntity getUsersEntity() {
        return usersEntity;
    }
    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }
    public int getOpinionTrainerId() {
        return opinionTrainerId;
    }
    public void setOpinionTrainerId(int opinionTrainerId) {
        this.opinionTrainerId = opinionTrainerId;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}