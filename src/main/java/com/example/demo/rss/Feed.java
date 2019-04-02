package com.example.demo.rss;

import com.example.demo.app.sports_news.SportsNewsDto;

import java.util.ArrayList;
import java.util.List;

public class Feed {
    final String title;
    final String link;
    final String description;
    final String pubDate;
    final String enclosure;

    final List<SportsNewsDto> entries = new ArrayList<SportsNewsDto>();

    public Feed(String title, String link, String description, String pubDate, String enclosure) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.pubDate = pubDate;
        this.enclosure = enclosure;
    }

    public String getEnclosure() { return enclosure; }

    public List<SportsNewsDto> getMessages() {
        return entries;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public String getPubDate() {
        return pubDate;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", description='" + description + '\'' +
                ", pubDate='" + pubDate + '\'' +
                ", enclosure='" + enclosure + '\'' +
                ", entries=" + entries +
                '}';
    }
}