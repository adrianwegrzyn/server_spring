package com.example.demo.user;

import com.example.demo.user.body.BodyDto;

public class UsersDto {
    private String nick;
    private String email;
    private String photo;
    private String dateOfBirth;
    private String password;
    private BodyDto body;

    public BodyDto getBody() {
        return body;
    }

    public void setBody(BodyDto body) {
        this.body = body;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
