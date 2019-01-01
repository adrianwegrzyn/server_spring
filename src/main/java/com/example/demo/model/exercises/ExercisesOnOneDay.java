//package com.example.demo.model.exercises;
//
//import com.fasterxml.jackson.annotation.JsonBackReference;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import javax.persistence.*;
//import java.util.Date;
//import java.util.List;
//
//@Entity
//@Table(name = "exercise_on_one_day",schema = "public")
////@SecondaryTable(name = "Exercise", pkJoinColumns = @PrimaryKeyJoinColumn(name = "id_user"))
//public class ExercisesOnOneDay {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name="id_exercise_one_day")
//    private int idExerciseOneDay;
//    @Temporal(TemporalType.DATE)
//    @Column(name="date_day")
//    private Date dateDay;
//
//
//        @ManyToOne(fetch = FetchType.EAGER)
//        @JoinColumn(name="id_exercise_on_seven_days")
//        private ExercisesOnSevenDays exercisesOnSevenDays;
//
//        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//        @JoinColumn(name = "id_exercise_one_day")
//        private List<Exercise> exercise;
//
//    public List<Exercise> getExercise() {
//        return exercise;
//    }
//
//    public void setIdExerciseOneDay(int idExerciseOneDay) {
//        this.idExerciseOneDay = idExerciseOneDay;
//    }
//
//    public Date getDateDay() {
//        return dateDay;
//    }
//
//    public ExercisesOnOneDay setDateDay(Date dateDay) {
//        this.dateDay = dateDay;
//        return this;
//    }
//    public ExercisesOnOneDay setExercise(List<Exercise> exercise) {
//        this.exercise = exercise;
//        return this;
//    }
//
//    public void setExercisesOnSevenDays(ExercisesOnSevenDays exercisesOnSevenDays) {
//        this.exercisesOnSevenDays = exercisesOnSevenDays;
//    }
//}
