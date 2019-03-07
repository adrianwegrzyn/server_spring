package com.example.demo.exercises_on_all_day.exercises_on_one_day;


import com.example.demo.exercises_on_all_day.ExercisesOnAllDaysEntity;
import com.example.demo.exercises_on_all_day.exercise.ExerciseEntity;

import javax.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "exercise_on_one_day",schema = "exercise")
public class ExercisesOnOneDayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_exercise_one_day")
    private int idExerciseOneDay;
    @Temporal(TemporalType.DATE)
    @Column(name="date_day")
    private Date dateDay;
    @Column(name="name_warm_up")
    private String nameWarmUp;
    @Column(name="time_warm_up")
    private int timeWarmUp;
    @Column(name="name_cardio")
    private String nameCardio;
    @Column(name="time_cardio")
    private int timeCardio;


    @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="id_exercise_on_all_days")
        private ExercisesOnAllDaysEntity exercisesOnAllDaysDAO;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinColumn(name = "id_exercise_one_day")
        private List<ExerciseEntity> exercise;

    public ExercisesOnOneDayEntity() {
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

    public int getIdExerciseOneDay() {
        return idExerciseOneDay;
    }

    public void setIdExerciseOneDay(int idExerciseOneDay) {
        this.idExerciseOneDay = idExerciseOneDay;
    }

    public Date getDateDay() {
        return dateDay;
    }

    public void setDateDay(Date dateDay) {
        this.dateDay = dateDay;
    }



    public void setExercisesOnAllDaysDAO(ExercisesOnAllDaysEntity exercisesOnAllDaysDAO) {
        this.exercisesOnAllDaysDAO = exercisesOnAllDaysDAO;
    }

    public List<ExerciseEntity> getExercise() {
        return exercise;
    }

    public void setExercise(List<ExerciseEntity> exercise) {
        this.exercise = exercise;
    }
}
