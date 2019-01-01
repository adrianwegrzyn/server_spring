//package com.example.demo.model.exercises;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Table(name = "exercise_on_seven_days",schema = "public")
//public class ExercisesOnSevenDays {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id_exercise_on_seven_days")
//    private int idExerciseOnSevenDay;
//    //@Temporal(TemporalType.DATE)
//    @Column(name = "date_start")
//    private String dateStart;
//    @Column(name = "date_end")
//    private String dateEnd;
//
//        @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER )
//        @JoinColumn(name = "id_exercise_on_seven_days")
//
//        private List<ExercisesOnOneDay> exercisesOnOneDays;
//
//
//    public ExercisesOnSevenDays() { }
//
//    public List<ExercisesOnOneDay> getExercise() {
//        return exercisesOnOneDays;
//    }
//
//    public ExercisesOnSevenDays setExercise(List<ExercisesOnOneDay> exercisesOnOneDays) {
//        this.exercisesOnOneDays = exercisesOnOneDays;
//        return this;
//    }
//
//
//
//    public String getDateStart() {
//        return dateStart;
//    }
//
//    public ExercisesOnSevenDays setDateStart(String dateStart) {
//        this.dateStart = dateStart;
//        return this;
//    }
//
//    public String getDateEnd() {
//        return dateEnd;
//    }
//
//    public ExercisesOnSevenDays setDateEnd(String dateEnd) {
//        this.dateEnd = dateEnd;
//        return this;
//    }
//}
