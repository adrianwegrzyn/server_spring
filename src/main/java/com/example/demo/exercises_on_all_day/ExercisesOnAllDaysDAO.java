package com.example.demo.exercises_on_all_day;

import com.example.demo.exercises_on_one_day.ExercisesOnOneDayDAO;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "exercise_on_all_days",schema = "public")
public class ExercisesOnAllDaysDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_exercise_on_all_days")
    private int idExerciseOnAllDay;
    //@Temporal(TemporalType.DATE)
    @Column(name = "date_start")
    private String dateStart;
    @Column(name = "date_end")
    private String dateEnd;

        @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY )
        @JoinColumn(name = "id_exercise_on_all_days")
        private List<ExercisesOnOneDayDAO> exercisesOnOneDayDAOS;


    public ExercisesOnAllDaysDAO() { }


    public List<ExercisesOnOneDayDAO> getExercisesOnOneDayDAOS() {
        return exercisesOnOneDayDAOS;
    }

    public void setExercisesOnOneDayDAOS(List<ExercisesOnOneDayDAO> exercisesOnOneDayDAOS) {
        this.exercisesOnOneDayDAOS = exercisesOnOneDayDAOS;
    }

    public String getDateStart() {
        return dateStart;
    }

    public ExercisesOnAllDaysDAO setDateStart(String dateStart) {
        this.dateStart = dateStart;
        return this;
    }

    public String getDateEnd() {
        return dateEnd;
    }

    public ExercisesOnAllDaysDAO setDateEnd(String dateEnd) {
        this.dateEnd = dateEnd;
        return this;
    }
}
