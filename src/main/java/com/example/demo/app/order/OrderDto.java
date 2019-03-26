package com.example.demo.app.order;

import java.util.Date;

public class OrderDto {
    private String nameTrainingPlan;
    private int period;
    private String difficultyLevel;
    private String message;
    private boolean diet;
    private Date dateOrder;

    public OrderDto() {
    }

    public boolean isDiet() {
        return diet;
    }

    public void setDiet(boolean diet) {
        this.diet = diet;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getNameTrainingPlan() {
        return nameTrainingPlan;
    }

    public void setNameTrainingPlan(String nameTrainingPlan) {
        this.nameTrainingPlan = nameTrainingPlan;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
