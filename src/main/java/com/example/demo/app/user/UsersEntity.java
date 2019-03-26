package com.example.demo.app.user;

import com.example.demo.app.auth.AuthenticationEntity;
import com.example.demo.app.opinion.diet.OpinionDietEntity;
import com.example.demo.app.opinion.trainer.OpinionTrainerEntity;
import com.example.demo.app.user.body.BodyEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Long userId;
    @Column(name="e_mail")
    private String email;
    @Column(name="photo")
    private String photo;
    @Temporal(TemporalType.DATE)
    @Column(name="data_of_birth")
    private Date dateOfBirth;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_body")
    private BodyEntity body;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "authenticationEntity")
    @JsonIgnore
    private AuthenticationEntity authenticationEntity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    @JsonIgnore
    private List<OpinionTrainerEntity> opinionTrainerEntity;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_user")
    @JsonIgnore
    private List<OpinionDietEntity> opinionDietEntities;


    public UsersEntity() {
    }

    public BodyEntity getBody() {
        return body;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<OpinionDietEntity> getOpinionDietEntities() {
        return opinionDietEntities;
    }

    public void setOpinionDietEntities(List<OpinionDietEntity> opinionDietEntities) {
        this.opinionDietEntities = opinionDietEntities;
    }

    public List<OpinionTrainerEntity> getOpinionTrainerEntity() {
        return opinionTrainerEntity;
    }

    public void setOpinionTrainerEntity(List<OpinionTrainerEntity> opinionTrainerEntity) {
        this.opinionTrainerEntity = opinionTrainerEntity;
    }

    public AuthenticationEntity getAuthenticationEntity() {
        return authenticationEntity;
    }

    public void setAuthenticationEntity(AuthenticationEntity authenticationEntity) {
        this.authenticationEntity = authenticationEntity;
    }

    public void setBody(BodyEntity body) {
        this.body = body;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }





}