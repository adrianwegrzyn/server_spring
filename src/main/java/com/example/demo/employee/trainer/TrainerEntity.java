package com.example.demo.employee.trainer;

import com.example.demo.employee.EmployeesEntity;
import com.example.demo.opinion.trainer.OpinionTrainerEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trainer",schema = "public")
public class TrainerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Trainer", updatable  =  false , nullable  =  false)
    private Integer idTrainer;
    @Column(name = "speciality")
    private String speciality;
    @Column(name = "photo")
    private String photo;

    @OneToOne(mappedBy = "trainer")
    private EmployeesEntity employees;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_trainer")
    private List<OpinionTrainerEntity> opinionTrainers;


    public TrainerEntity(String speciality, String photo) {
        this.speciality = speciality;
        this.photo = photo;
    }

    public TrainerEntity() {
    }



    public void setEmployees(EmployeesEntity employees) {
        this.employees = employees;
    }


//    public List<OpinionTrainerEntity> getOpinionTrainers() {
//        return opinionTrainers;
//    }
//
//    public void setOpinionTrainers(List<OpinionTrainerEntity> opinionTrainers) {
//        this.opinionTrainers = opinionTrainers;
//    }

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
