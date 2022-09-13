package zcorps.updates;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


import java.io.*;

public class DBUpdateChecker {
    String url = "https://zodiaccorps.github.io/Website/";

    public String getVersion() throws IOException {
        Document document = Jsoup.connect(url).get();
        String updateTag = document.getElementsByClass("version").text();

        return updateTag;
    }

}
