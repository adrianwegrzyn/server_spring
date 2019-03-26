package com.example.demo.app.user.measurements;

import com.example.demo.app.user.body_measurements.BodyMeasurementsEntity;

import javax.persistence.*;


@Entity
@Table(name = "measurements")
public class MeasurementsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_physique", updatable  =  false , nullable  =  false)
    private int measurementsId;
    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private Double size;
    @Column(name = "progress")
    private Double progress;

    public MeasurementsEntity() {
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_body_measurements", foreignKey = @ForeignKey(name ="FK_PHYSIQUE" ))
    private BodyMeasurementsEntity bodyMeasurements;

    public Double getProgress() {
        return progress;
    }
    public void setProgress(Double progress) {
        this.progress = progress;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getSize() {
        return size;
    }
    public void setSize(Double size) {
        this.size = size;
    }



}
