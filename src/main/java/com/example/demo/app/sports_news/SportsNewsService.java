package com.example.demo.app.sports_news;


import java.util.List;

public interface SportsNewsService {
    List<SportsNewsEntity> getNews();
    void addNews(SportsNewsEntity sportsNewsEntity);
     void deleteNews();
}
