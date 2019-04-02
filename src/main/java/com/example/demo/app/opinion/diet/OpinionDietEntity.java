package com.example.demo.app.opinion.diet;

import com.example.demo.app.user.users.UsersEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "opinion_diet", schema = "public")
public class OpinionDietEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opinion_diet", updatable = false, nullable = false)
    private int opinionDietId;
    @Temporal(TemporalType.DATE)
    @Column(name = "date")
    private Date date;
    @Column(name = "message")
    private String message;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_user")
    @JsonIgnore
    private UsersEntity usersEntity;

    public OpinionDietEntity() {
    }

    public void setOpinionDietId(int opinionDietId) { this.opinionDietId = opinionDietId; }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

}
