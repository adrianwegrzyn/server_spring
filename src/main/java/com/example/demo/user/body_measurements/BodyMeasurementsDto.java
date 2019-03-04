package com.example.demo.user.body_measurements;

import com.example.demo.user.body.BodyEntity;
import com.example.demo.user.physique.PhysiqueDto;
import java.util.Date;
import java.util.List;

public class BodyMeasurementsDto {
    private int idUser;
    private String weight;
    private Date date;
    private List<PhysiqueDto> physiques;
    private BodyEntity bodyEntity;

    public BodyMeasurementsDto() {
    }

    public BodyEntity getBodyEntity() {
        return bodyEntity;
    }

    public void setBodyEntity(BodyEntity bodyEntity) {
        this.bodyEntity = bodyEntity;
    }

    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public List<PhysiqueDto> getPhysiques() {
        return physiques;
    }
    public void setPhysiques(List<PhysiqueDto> physiques) {
        this.physiques = physiques;
    }
}
