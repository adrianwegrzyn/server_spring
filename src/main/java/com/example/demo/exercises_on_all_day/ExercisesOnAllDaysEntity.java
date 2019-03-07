package com.example.demo.exercises_on_all_day;

import com.example.demo.exercises_on_all_day.exercises_on_one_day.ExercisesOnOneDayEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "exercise_on_all_days",schema = "exercise")
public class ExercisesOnAllDaysEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exercise_on_all_days")
    private int idExerciseOnAllDay;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_plan_start")
    private Date datePlanStart;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_plan_end")
    private Date datePlanEnd;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY )
    @JoinColumn(name = "id_exercise_on_all_days")
    private List<ExercisesOnOneDayEntity> exercisesOnOneDay;

    public ExercisesOnAllDaysEntity() { }


    public List<ExercisesOnOneDayEntity> getExercisesOnOneDay() {
        return exercisesOnOneDay;
    }

    public void setExercisesOnOneDay(List<ExercisesOnOneDayEntity> exercisesOnOneDay) {
        this.exercisesOnOneDay = exercisesOnOneDay;
    }

    public int getIdExerciseOnAllDay() {
        return idExerciseOnAllDay;
    }

    public void setIdExerciseOnAllDay(int idExerciseOnAllDay) {
        this.idExerciseOnAllDay = idExerciseOnAllDay;
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
