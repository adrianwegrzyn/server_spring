package com.example.demo.exercises_on_one_day;


import com.example.demo.exercises_on_all_day.ExercisesOnAllDaysDAO;
import com.example.demo.exercise.ExerciseDAO;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "exercise_on_one_day")
public class ExercisesOnOneDayDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_exercise_one_day")
    private int idExerciseOneDay;
    @Temporal(TemporalType.DATE)
    @Column(name="date_day")
    private Date dateDay;

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name="id_exercise_on_all_days")
        private ExercisesOnAllDaysDAO exercisesOnAllDaysDAO;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinColumn(name = "id_exercise_one_day")
        private List<ExerciseDAO> exerciseDAO;

    public ExercisesOnOneDayDAO() {
    }

    public ExercisesOnAllDaysDAO getExercisesOnAllDaysDAO() {
        return exercisesOnAllDaysDAO;
    }

    public void setExercisesOnAllDaysDAO(ExercisesOnAllDaysDAO exercisesOnAllDaysDAO) {
        this.exercisesOnAllDaysDAO = exercisesOnAllDaysDAO;
    }

    public List<ExerciseDAO> getExerciseDAO() {
        return exerciseDAO;
    }

    public void setIdExerciseOneDay(int idExerciseOneDay) {
        this.idExerciseOneDay = idExerciseOneDay;
    }

    public Date getDateDay() {
        return dateDay;
    }

    public ExercisesOnOneDayDAO setDateDay(Date dateDay) {
        this.dateDay = dateDay;
        return this;
    }
    public ExercisesOnOneDayDAO setExerciseDAO(List<ExerciseDAO> exerciseDAO) {
        this.exerciseDAO = exerciseDAO;
        return this;
    }


}
