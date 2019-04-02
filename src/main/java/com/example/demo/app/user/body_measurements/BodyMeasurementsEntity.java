package com.example.demo.app.user.body_measurements;

import com.example.demo.app.user.body.BodyEntity;
import com.example.demo.app.user.measurements.MeasurementsEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "body_measurements")
public class BodyMeasurementsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_body_measurements", updatable = false, nullable = false)
    private int bodyMeasurementsId;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    public BodyMeasurementsEntity() {
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_body_measurements")
    @JsonIgnore
    private List<MeasurementsEntity> measurements;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_body")
    @JsonIgnore
    private BodyEntity bodyEntity;

    public void setBodyEntity(BodyEntity bodyEntity) {
        this.bodyEntity = bodyEntity;
    }

    public List<MeasurementsEntity> getMeasurements() {
        return measurements;
    }

    public void setMeasurements(List<MeasurementsEntity> measurements) {
        this.measurements = measurements;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}