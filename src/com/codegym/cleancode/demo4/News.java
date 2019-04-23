package com.codegym.cleancode.demo4;

public class News {
    private String title;
    private String teaser;
    private String content;

    public News(String title, String teaser, String content) {
        this.title = title;
        this.teaser = teaser;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
