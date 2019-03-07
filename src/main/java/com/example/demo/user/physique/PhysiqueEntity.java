package com.example.demo.user.physique;

import com.example.demo.user.body_measurements.BodyMeasurementsEntity;

import javax.persistence.*;


@Entity
@Table(name = "physique",schema = "users")
public class PhysiqueEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_physique", updatable  =  false , nullable  =  false)
    private int idPhysique;
    @Column(name = "name")
    private String name;
    @Column(name = "size")
    private Double size;
    @Column(name = "progres")
    private Double progres;

    public PhysiqueEntity() {
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id_body_measurements",foreignKey = @ForeignKey(name ="FK_PHYSIQUE" ))
    private BodyMeasurementsEntity bodyMeasurements;

    public void setProgres(Double progres) {
        this.progres = progres;
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
    public Double getProgres() {
        return progres;
    }


}
