package com.example.demo.employee.trainer;

import com.example.demo.employee.EmployeesEntity;
import com.example.demo.opinion.trainer.OpinionTrainerDto;

import java.util.List;

public class TrainerDto {
    private String speciality;
    private String photo;
    private List<OpinionTrainerDto> opinionTrainers;

    public TrainerDto() { }



    public List<OpinionTrainerDto> getOpinionTrainers() {
        return opinionTrainers;
    }

    public void setOpinionTrainers(List<OpinionTrainerDto> opinionTrainers) {
        this.opinionTrainers = opinionTrainers;
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
