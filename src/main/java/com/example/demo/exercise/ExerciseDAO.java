package com.example.demo.exercise;

import com.example.demo.exercises_on_one_day.ExercisesOnOneDayDAO;

import javax.persistence.*;

@Entity
@Table(name = "com.example.demo.exercise")
public class ExerciseDAO {

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
        private ExercisesOnOneDayDAO exercisesOnOneDayDAO;


    public ExerciseDAO() {
    }

    public void setExercisesOnOneDayDAO(ExercisesOnOneDayDAO exercisesOnOneDayDAO) {
        this.exercisesOnOneDayDAO = exercisesOnOneDayDAO;
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
