package com.example.demo.app.training_plan.exercises_on_one_day;

import com.example.demo.app.training_plan.TrainingPlanEntity;
import com.example.demo.app.training_plan.exercise.ExerciseEntity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exercise_on_one_day")
public class ExercisesOnOneDayEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_exercise_one_day")
    private int idExerciseOneDay;
    @Column(name="day")
    private int nrDay;
    @Column(name="name_warm_up")
    private String nameWarmUp;
    @Column(name="time_warm_up")
    private int timeWarmUp;
    @Column(name="name_cardio")
    private String nameCardio;
    @Column(name="time_cardio")
    private int timeCardio;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_training_plan")
    private TrainingPlanEntity trainingPlanEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_exercise_one_day")
    private List<ExerciseEntity> exercise;

    public ExercisesOnOneDayEntity() { }

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


    public int getNrDay() {
        return nrDay;
    }

    public void setNrDay(int nrDay) {
        this.nrDay = nrDay;
    }

    public void setTrainingPlanEntity(TrainingPlanEntity trainingPlanEntity) {
        this.trainingPlanEntity = trainingPlanEntity;
    }

    public List<ExerciseEntity> getExercise() {
        return exercise;
    }
    public void setExercise(List<ExerciseEntity> exercise) {
        this.exercise = exercise;
    }
}
