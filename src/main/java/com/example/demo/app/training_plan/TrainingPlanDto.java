package com.example.demo.app.training_plan;

import com.example.demo.app.training_plan.exercises_on_one_day.ExercisesOnOneDayDto;

import java.util.List;

public class TrainingPlanDto {
    private int trainingPlanId;
    private String nameTrainingPlan;
    private String photo;
    private String level;
    private int period;
    private List<ExercisesOnOneDayDto> exercisesOnOneDay;

    public TrainingPlanDto() { }

    public List<ExercisesOnOneDayDto> getExercisesOnOneDay() {
        return exercisesOnOneDay;
    }
    public void setExercisesOnOneDay(List<ExercisesOnOneDayDto> exercisesOnOneDay) { this.exercisesOnOneDay = exercisesOnOneDay; }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getNameTrainingPlan() {
        return nameTrainingPlan;
    }

    public void setNameTrainingPlan(String nameTrainingPlan) {
        this.nameTrainingPlan = nameTrainingPlan;
    }

    public int getTrainingPlanId() {
        return trainingPlanId;
    }

    public void setTrainingPlanId(int trainingPlanId) {
        this.trainingPlanId = trainingPlanId;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}