package com.example.demo.app.plan.training_plan;

import com.example.demo.app.plan.exercises_on_one_day.ExercisesOnOneDayEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "plan")
public class TrainingPlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "training_plan_id")
    private int trainingPlanId;
    @Column(name = "name_training_plan")
    private String nameTrainingPlan;
    @Column(name = "photo")
    private String photo;
    @Column(name = "level")
    private String level;
    @Column(name = "period")
    private int period;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_training_plan")
    private List<ExercisesOnOneDayEntity> exercisesOnOneDay;

    public TrainingPlanEntity() {
    }

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

    public List<ExercisesOnOneDayEntity> getExercisesOnOneDay() {
        return exercisesOnOneDay;
    }

    public void setExercisesOnOneDay(List<ExercisesOnOneDayEntity> exercisesOnOneDay) {
        this.exercisesOnOneDay = exercisesOnOneDay;
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