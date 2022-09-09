package zcorps;

import zcorps.files.FileUpdater;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception {
        FileUpdater fupd = new FileUpdater();
        URL url = new URL("");

        fupd.download(url, "Database/");
    }
}
