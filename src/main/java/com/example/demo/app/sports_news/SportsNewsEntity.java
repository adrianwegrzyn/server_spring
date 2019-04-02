package com.example.demo.app.sports_news;

import javax.persistence.*;

@Entity
@Table(name = "sports_news")
public class SportsNewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sportsNewsId;
    private String title;
    @Lob
    @Column(name = "description", length = 512)
    private String description;
    private String link;

    private String datePub;
    private String photo;

    public SportsNewsEntity() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public String getDatePub() {
        return datePub;
    }

    public void setDatePub(String datePub) {
        this.datePub = datePub;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
