package com.example.demo.model;


import com.example.demo.model.opinion.OpinionTrainer;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "employees",schema = "public")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee", updatable  =  false , nullable  =  false)
    private Integer idEmployee;

    @Column(name = "first_name")
    private String firstName;

    @Temporal(TemporalType.DATE)
    @Column(name="date_of_birth")
    private Date dateOfBirth;

    @Column(name = "last_name")
    private String lastName;

    @Column(name="speciality")
    private String speciality;

    @Column(name = "photo")
    private String photo;




    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_employee")
    private List<OpinionTrainer> opinionTrainers;

    public Employees() {
    }

    public List<OpinionTrainer> getOpinionTrainers() {
        return opinionTrainers;
    }

    public void setOpinionTrainers(List<OpinionTrainer> opinionTrainers) {
        this.opinionTrainers = opinionTrainers;
    }

    public Integer getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Integer idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
