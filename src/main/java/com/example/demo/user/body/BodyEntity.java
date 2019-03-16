package com.example.demo.user.body;

import com.example.demo.user.body_measurements.BodyMeasurementsEntity;
import com.example.demo.user.UsersEntity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "body",schema = "users")
public class BodyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_body")
    private int idBody;
    @Column(name = "growth")
    private Double growth;
    @Column(name = "silhouette")
    private String silhouette;

    public BodyEntity() {
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_body")
    private List<BodyMeasurementsEntity> bodyMeasurements;

    @OneToOne(mappedBy = "body")
    private UsersEntity usersEntity;

//    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//    @JoinColumn(name = "id_user")
//    private UsersEntity users;


    public void setUsersEntity(UsersEntity usersEntity) {
        this.usersEntity = usersEntity;
    }

    public List<BodyMeasurementsEntity> getBodyMeasurements() {
        return bodyMeasurements;
    }

    public void setBodyMeasurements(List<BodyMeasurementsEntity> bodyMeasurements) {
        this.bodyMeasurements = bodyMeasurements;
    }

    public String getSilhouette() {
        return silhouette;
    }

    public void setSilhouette(String silhouette) {
        this.silhouette = silhouette;
    }

    public Double getGrowth() {
        return growth;
    }

    public void setGrowth(Double growth) {
        this.growth = growth;
    }

    public int getIdBody() {
        return idBody;
    }

    public void setIdBody(int idBody) {
        this.idBody = idBody;
    }
}
