package com.example.demo.app.user.body_measurements;

import com.example.demo.app.user.body.BodyEntity;
import com.example.demo.app.user.measurements.MeasurementsDto;
import java.util.Date;
import java.util.List;

public class BodyMeasurementsDto {
    private String weight;
    private Date date;
    private List<MeasurementsDto> measurements;


    public BodyMeasurementsDto() {
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
    public List<MeasurementsDto> getMeasurements() {
        return measurements;
    }
    public void setMeasurements(List<MeasurementsDto> measurements) {
        this.measurements = measurements;
    }
}
