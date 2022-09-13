package zcorps;

import zcorps.files.FileUpdater;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        FileUpdater fupd = new FileUpdater();
        Logger log = Logger.getLogger("log");
        fupd.update("Database", log);


    }
}
