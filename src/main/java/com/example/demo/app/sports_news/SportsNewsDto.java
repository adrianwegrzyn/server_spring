package com.example.demo.app.sports_news;

public class SportsNewsDto {

    String title;
    String description;
    String link;
    String datePub;
    String photo;

    public SportsNewsDto() {
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    @Override
    public String toString() {
        return "SportsNewsDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", link='" + link + '\'' +
                ", datePub='" + datePub + '\'' +
                ", photo='" + photo + '\'' +
                '}';
    }


}