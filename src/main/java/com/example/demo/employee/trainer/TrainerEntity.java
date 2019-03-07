package com.example.demo.employee.trainer;

import com.example.demo.employee.EmployeesEntity;
import com.example.demo.opinion.trainer.OpinionTrainerEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trainer",schema = "public")
public class TrainerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trainer", updatable  =  false , nullable  =  false)
    private int trainerId;
    @Column(name = "speciality")
    private String speciality;
    @Column(name = "photo")
    private String photo;

    @OneToOne(mappedBy = "trainer")
    private EmployeesEntity employees;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_trainer")
    private List<OpinionTrainerEntity> opinionTrainers;




    public TrainerEntity() {
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int trainerId) {
        this.trainerId = trainerId;
    }

    public void setEmployees(EmployeesEntity employees) {
        this.employees = employees;
    }


    public List<OpinionTrainerEntity> getOpinionTrainers() {
        return opinionTrainers;
    }

    public void setOpinionTrainers(List<OpinionTrainerEntity> opinionTrainers) {
        this.opinionTrainers = opinionTrainers;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
