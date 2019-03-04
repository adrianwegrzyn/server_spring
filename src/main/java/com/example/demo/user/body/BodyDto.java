package com.example.demo.user.body;

import com.example.demo.user.body_measurements.BodyMeasurementsDto;

import java.util.List;

public class BodyDto {
    private int idBody;
    private Double growth;
    private String silhouette;
    private List<BodyMeasurementsDto> bodyMeasurements;

    public BodyDto() {
    }

    public List<BodyMeasurementsDto> getBodyMeasurements() {
        return bodyMeasurements;
    }

    public void setBodyMeasurements(List<BodyMeasurementsDto> bodyMeasurements) {
        this.bodyMeasurements = bodyMeasurements;
    }

    public int getIdBody() {
        return idBody;
    }

    public void setIdBody(int idBody) {
        this.idBody = idBody;
    }

    public Double getGrowth() {
        return growth;
    }

    public void setGrowth(Double growth) {
        this.growth = growth;
    }

    public String getSilhouette() {
        return silhouette;
    }

    public void setSilhouette(String silhouette) {
        this.silhouette = silhouette;
    }
}
