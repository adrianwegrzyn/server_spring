package com.example.demo.app.sports_news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/news")

public class SportsNewsController {
    private final
    SportsNewsService sportsNewsService;

    @Autowired
    public SportsNewsController(SportsNewsService sportsNewsService) {
        this.sportsNewsService = sportsNewsService;
    }

    @CrossOrigin
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public List<SportsNewsEntity> getNews() {
        return sportsNewsService.getNews();
    }



}
