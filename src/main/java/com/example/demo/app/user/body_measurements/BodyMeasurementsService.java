package com.example.demo.app.user.body_measurements;

import com.example.demo.exception.BodyIsEmptyException;

import java.util.List;

public interface BodyMeasurementsService {
    void countProgress(BodyMeasurementsDto bodyMeasurementsDto, String username) throws BodyIsEmptyException;
    BodyMeasurementsDto getLastMeasurements(String username);
    List<BodyMeasurementsDto> getFiveLastMeasurements(String username);
}
