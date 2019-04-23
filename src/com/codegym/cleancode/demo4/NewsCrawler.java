package com.codegym.cleancode.demo4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewsCrawler {
    public News crawl(String urlPath) throws IOException {
        URL url = new URL(urlPath);
        URLConnection urlConnection = url.openConnection();
        urlConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.11; rv:45.0) Gecko/20100101 Firefox/45.0");
        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), Charset.forName("UTF-8")));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append("\n");
        }
        reader.close();
        String content = stringBuilder.toString();

        Pattern titlePattern = Pattern.compile("<h1 class=\"title_news_detail mb10\">([\\S\\s]*)</h1>");
        Matcher titleMatcher = titlePattern.matcher(content);
        String title = "";
        if(titleMatcher.find()) {
            title = titleMatcher.group(1).trim();
        }

        Pattern descriptionPattern = Pattern.compile("<p class=\"description\">([\\S\\s]*?)</p>");
        Matcher descriptionMatcher = descriptionPattern.matcher(content);
        String description = "";
        if(descriptionMatcher.find()) {
            description = descriptionMatcher.group(1).trim();
        }

        Pattern contentPattern = Pattern.compile("<article([\\S\\s]*?)</article>");
        Matcher contentMatcher = contentPattern.matcher(content);
        String mainContent = "";
        if(contentMatcher.find()) {
            mainContent = contentMatcher.group(0).trim();
        }
        return new News(title, description, mainContent);
    }
}
