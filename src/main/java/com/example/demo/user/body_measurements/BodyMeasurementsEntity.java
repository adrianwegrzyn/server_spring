package com.example.demo.user.body_measurements;

import com.example.demo.user.body.BodyEntity;
import com.example.demo.user.physique.PhysiqueEntity;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "body_measurements",schema = "users")
public class BodyMeasurementsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_body_measurements", updatable  =  false , nullable  =  false)
    private int idBodyMeasurements;
    @Column(name="weight")
    private String weight;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;

    public BodyMeasurementsEntity() { }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_body_measurements")
    private List<PhysiqueEntity> physiques;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_body")
    private BodyEntity bodyEntity;

    public void setBodyEntity(BodyEntity bodyEntity) {
        this.bodyEntity = bodyEntity;
    }
    public List<PhysiqueEntity> getPhysiques() {
        return physiques;
    }
    public void setPhysiques(List<PhysiqueEntity> physiques) {
        this.physiques = physiques;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

}
