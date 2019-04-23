package com.codegym.cleancode.demo4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        NewsCrawler newsCrawler = new NewsCrawler();
        try {
            News news = newsCrawler.crawl("https://vnexpress.net/the-gioi/philippines-lai-rung-chuyen-boi-dong-dat-3913605.html");
            System.out.println(news.getTitle());
            System.out.println();
            System.out.println(news.getTeaser());
            System.out.println();
            System.out.println(news.getContent());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
