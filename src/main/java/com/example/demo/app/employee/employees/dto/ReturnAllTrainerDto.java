package com.example.demo.app.employee.employees.dto;

import com.example.demo.app.opinion.trainer.dto.ReturnOpinionTrainerDto;

import java.util.List;

public class ReturnAllTrainerDto {

    private int trainerId;
    private String firstName;
    private String lastName;
    private String speciality;
    private String photo;
    private List<ReturnOpinionTrainerDto> returnOpinionTrainerDto;

    public ReturnAllTrainerDto(int trainerId, String firstName, String lastName, String speciality, String photo) {
        this.trainerId = trainerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.photo = photo;
    }

    public ReturnAllTrainerDto(int trainerId, String firstName, String lastName, String speciality, String photo, List<ReturnOpinionTrainerDto> returnOpinionTrainerDto) {
        this.trainerId = trainerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.speciality = speciality;
        this.photo = photo;
        this.returnOpinionTrainerDto = returnOpinionTrainerDto;
    }

    public List<ReturnOpinionTrainerDto> getReturnOpinionTrainerDto() {
        return returnOpinionTrainerDto;
    }

    public void setReturnOpinionTrainerDto(List<ReturnOpinionTrainerDto> returnOpinionTrainerDto) {
        this.returnOpinionTrainerDto = returnOpinionTrainerDto;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(int     trainerId) {
        this.trainerId = trainerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
