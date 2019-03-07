package com.example.demo.exercises_on_all_day.exercise;

import com.example.demo.exercises_on_all_day.exercises_on_one_day.ExercisesOnOneDayEntity;

import javax.persistence.*;

@Entity
@Table(name = "exercise",schema = "exercise")
public class ExerciseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_exercise")
    private int idExercise;
    @Column(name = "name_exercise")
    private String nameExercise;
    @Column(name = "repetitions")
    private int repetitions;
    @Column(name = "series")
    private int series;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_exercise_one_day")
    private ExercisesOnOneDayEntity exercisesOnOneDayEntity;


    public ExerciseEntity() {
    }



    public void setExercisesOnOneDayEntity(ExercisesOnOneDayEntity exercisesOnOneDayEntity) {
        this.exercisesOnOneDayEntity = exercisesOnOneDayEntity;
    }

    public int getSeries() {
        return series;
    }

    public int getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public void setNameExercise(String nameExercise) {
        this.nameExercise = nameExercise;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public void setSeries(int series) {
        this.series = series;
    }
}
