package com.example.demo.opinion.trainer;

import com.example.demo.employee.trainer.TrainerDto;
import com.example.demo.employee.trainer.TrainerEntity;

import java.util.Date;

public class OpinionTrainerDto {
    private int userId;
    private int trainerId;
    private Date date;
    private String message;


    public OpinionTrainerDto(){
    }





    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public int getTrainerId() {
        return trainerId;
    }
    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
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

