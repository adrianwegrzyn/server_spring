package com.example.demo.app.user.body_measurements;

import com.example.demo.app.user.measurements.MeasurementsDto;

import java.util.Date;
import java.util.List;

public class BodyMeasurementsDto {

    private Date date;
    private List<MeasurementsDto> measurements;

    public BodyMeasurementsDto() {
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
