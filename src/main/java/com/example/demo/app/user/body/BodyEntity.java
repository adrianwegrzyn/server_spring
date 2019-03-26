package com.example.demo.app.user.body;

import com.example.demo.app.user.body_measurements.BodyMeasurementsEntity;
import com.example.demo.app.user.UsersEntity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "body")
public class BodyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_body")
    private int idBody;
    @Column(name = "height")
    private Double height;
    @Column(name = "build")
    private String build;

    public BodyEntity() {
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_body")
    private List<BodyMeasurementsEntity> bodyMeasurements;

    @OneToOne(mappedBy = "body")
    private UsersEntity users;

//    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_user")
//    private UsersEntity users;


    public UsersEntity getUsers() {
        return users;
    }

    public void setUsers(UsersEntity users) {
        this.users = users;
    }

    public List<BodyMeasurementsEntity> getBodyMeasurements() {
        return bodyMeasurements;
    }

    public void setBodyMeasurements(List<BodyMeasurementsEntity> bodyMeasurements) { this.bodyMeasurements = bodyMeasurements; }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getBuild() {
        return build;
    }

    public void setBuild(String build) {
        this.build = build;
    }

    public int getIdBody() {
        return idBody;
    }

    public void setIdBody(int idBody) {
        this.idBody = idBody;
    }
}
