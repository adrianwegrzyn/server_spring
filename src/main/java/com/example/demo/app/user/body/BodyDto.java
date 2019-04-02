package com.example.demo.app.user.body;

import com.example.demo.app.user.users.UsersDto;
import com.example.demo.app.user.body_measurements.BodyMeasurementsDto;

import java.util.List;

public class BodyDto {
    private Double height;
    private String build;
    private List<BodyMeasurementsDto> bodyMeasurements;
    private UsersDto users;

    public BodyDto() { }

   
    public void setUsers(UsersDto users) {
        this.users = users;
    }

    public List<BodyMeasurementsDto> getBodyMeasurements() {
        return bodyMeasurements;
    }

    public void setBodyMeasurements(List<BodyMeasurementsDto> bodyMeasurements) { this.bodyMeasurements = bodyMeasurements; }

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
}
