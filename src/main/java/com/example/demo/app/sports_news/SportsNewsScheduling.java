package com.example.demo.app.sports_news;

import com.example.demo.rss.Feed;
import com.example.demo.rss.RSSFeedParser;
import org.jsoup.Jsoup;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.ScheduledTask;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class SportsNewsScheduling {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTask.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");



   private final
   SportsNewsService sportsNewsService;

    @Autowired
    public SportsNewsScheduling(SportsNewsService sportsNewsService) {
        this.sportsNewsService = sportsNewsService;
    }

    @Scheduled(fixedRate = 20000000)
    public void executeTask() {
        System.out.println("siema");
        ModelMapper modelMapper = new ModelMapper();
        RSSFeedParser parser = new RSSFeedParser("https://www.rmf24.pl/sport/feed");
        Feed feed = parser.readFeed();
        if(feed != null) {
            Iterator var3 = feed.getMessages().iterator();
            sportsNewsService.deleteNews();

            while (var3.hasNext()) {
                SportsNewsDto message = (SportsNewsDto) var3.next();
                String s = message.getDescription();

                StringBuilder sb = new StringBuilder(s);
                String textOnly = Jsoup.parse(sb.toString()).text();
                StringBuilder sb2 = new StringBuilder(textOnly);

                int i = 0;
                while ((i = sb2.indexOf(" ", i + 70)) != -1) {
                    sb2.replace(i, i + 1, "\n");
                }
                message.setDescription(sb2.toString());

                SportsNewsEntity sportsNewsEntity = modelMapper.map(message, SportsNewsEntity.class);
                sportsNewsService.addNews(sportsNewsEntity);

            }
        }

    }
}
