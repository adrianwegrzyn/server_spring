package com.example.demo;


import com.example.demo.rss.Feed;
import com.example.demo.rss.FeedMessage;
import com.example.demo.rss.RSSFeedParser;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.jsoup.Jsoup;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


import java.util.Iterator;


@SpringBootApplication()
@EnableJpaRepositories("com.example.demo")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

//        RSSFeedParser parser = new RSSFeedParser(
//                "https://www.rmf24.pl/sport/feed");
//        Feed feed = parser.readFeed();
//        Iterator var3 = feed.getMessages().iterator();
//
//        while(var3.hasNext()) {
//            FeedMessage message = (FeedMessage)var3.next();
//            String s = message.getDescription();
//            System.out.println("Tytuł: " + message.getTitle());
//            System.out.println("Desc: " + message.getLink());
//            System.out.println("---------------------------------------------------------------------------------------");
//            StringBuilder sb = new StringBuilder(s);
//            String textOnly = Jsoup.parse(sb.toString()).text();
//            StringBuilder sb2 = new StringBuilder(textOnly);
//            int i = 0;
//
//            while((i = sb2.indexOf(" ", i + 70)) != -1) {
//                sb2.replace(i, i + 1, "\n");
//            }
//
//            System.out.println("Opis: " + sb2.toString());
//            System.out.println("---------------------------------------------------------------------------------------");
//        }

    }



}

