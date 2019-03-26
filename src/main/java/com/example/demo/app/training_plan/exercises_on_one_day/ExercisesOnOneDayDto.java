package com.example.demo.app.training_plan.exercises_on_one_day;

import com.example.demo.app.training_plan.exercise.ExerciseDto;

import java.util.List;

public class ExercisesOnOneDayDto {
    private int nrDay;
    private String nameWarmUp;
    private int timeWarmUp;
    private String nameCardio;
    private int timeCardio;
    private List<ExerciseDto> exercise;

    public ExercisesOnOneDayDto() { }

    public List<ExerciseDto> getExercise() {
        return exercise;
    }

    public void setExercise(List<ExerciseDto> exercise) {
        this.exercise = exercise;
    }

    public int getNrDay() {
        return nrDay;
    }

    public void setNrDay(int nrDay) {
        this.nrDay = nrDay;
    }

    public String getNameWarmUp() {
        return nameWarmUp;
    }

    public void setNameWarmUp(String nameWarmUp) {
        this.nameWarmUp = nameWarmUp;
    }

    public int getTimeWarmUp() {
        return timeWarmUp;
    }

    public void setTimeWarmUp(int timeWarmUp) {
        this.timeWarmUp = timeWarmUp;
    }

    public String getNameCardio() {
        return nameCardio;
    }

    public void setNameCardio(String nameCardio) {
        this.nameCardio = nameCardio;
    }

    public int getTimeCardio() {
        return timeCardio;
    }

    public void setTimeCardio(int timeCardio) {
        this.timeCardio = timeCardio;
    }
}
