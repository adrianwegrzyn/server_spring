package com.example.demo.app.sports_news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SportsNewsServiceImpl implements SportsNewsService {
    private final SportsNewsRepository sportsNewsRepository;

    @Autowired
    public SportsNewsServiceImpl(SportsNewsRepository sportsNewsRepository) {
        this.sportsNewsRepository = sportsNewsRepository;
    }

    @Override
    public List<SportsNewsEntity> getNews() {
        return sportsNewsRepository.findAll();
    }

    @Override
    public void addNews(SportsNewsEntity sportsNewsEntity) {
        sportsNewsRepository.save(sportsNewsEntity);

    }


    @Override
    public void deleteNews() {
        List<SportsNewsEntity> sportsNewsEntityList = sportsNewsRepository.findAll();
        for (SportsNewsEntity s : sportsNewsEntityList) {
            sportsNewsRepository.delete(s);
        }
    }

}