package com.example.demo.exercises_on_all_day;

import com.example.demo.exercises_on_all_day.exercises_on_one_day.ExercisesOnOneDayDto;

import java.util.Date;
import java.util.List;

public class ExercisesOnAllDaysDto {
    private Date datePlanStart;
    private Date datePlanEnd;
    private List<ExercisesOnOneDayDto> exercisesOnOneDay;

    public ExercisesOnAllDaysDto() {
    }

    public List<ExercisesOnOneDayDto> getExercisesOnOneDay() {
        return exercisesOnOneDay;
    }

    public void setExercisesOnOneDay(List<ExercisesOnOneDayDto> exercisesOnOneDay) {
        this.exercisesOnOneDay = exercisesOnOneDay;
    }

    public Date getDatePlanStart() {
        return datePlanStart;
    }

    public void setDatePlanStart(Date datePlanStart) {
        this.datePlanStart = datePlanStart;
    }

    public Date getDatePlanEnd() {
        return datePlanEnd;
    }

    public void setDatePlanEnd(Date datePlanEnd) {
        this.datePlanEnd = datePlanEnd;
    }
}
