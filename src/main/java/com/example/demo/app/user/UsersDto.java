package com.example.demo.app.user;

import com.example.demo.app.auth.AuthenticationEntity;
import com.example.demo.app.user.body.BodyDto;

import java.util.Date;

public class UsersDto {
    private String email;
    private String photo;
    private Date dateOfBirth;
    private BodyDto body;
    private AuthenticationEntity authentication;

    public UsersDto() {
    }

    public AuthenticationEntity getAuthentication() {
        return authentication;
    }

    public void setAuthentication(AuthenticationEntity authentication) {
        this.authentication = authentication;
    }

    public BodyDto getBody() {
        return body;
    }

    public void setBody(BodyDto body) {
        this.body = body;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() { return email; }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
