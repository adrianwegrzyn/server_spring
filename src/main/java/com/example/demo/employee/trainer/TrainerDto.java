package com.example.demo.employee.trainer;

public class TrainerDto {
    private String speciality;
    private String photo;

    public TrainerDto(String speciality, String photo) {
        this.speciality = speciality;
        this.photo = photo;
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
