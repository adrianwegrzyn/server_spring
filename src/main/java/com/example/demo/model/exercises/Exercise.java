package com.example.demo.model.exercises;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Table(name = "exercise")
public class Exercise {

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
        @JoinColumn(name="id_exercise_one_day", foreignKey = @ForeignKey(name ="FK_EXERCISE_ONE_DAY" ))
        private ExercisesOnOneDay exercisesOnOneDay;





    public void setExercisesOnOneDay(ExercisesOnOneDay exercisesOnOneDay) {
        this.exercisesOnOneDay = exercisesOnOneDay;
    }

    public int getSeries() {
        return series;
    }

    public Exercise setSeries(int series) {
        this.series = series;
        return this;
    }

    public String getNameExercise() {
        return nameExercise;
    }

    public Exercise setNameExercise(String nameExercise) {
        this.nameExercise = nameExercise;
        return this;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public Exercise setRepetitions(int repetitions) {
        this.repetitions = repetitions;
        return this;

    }
}
