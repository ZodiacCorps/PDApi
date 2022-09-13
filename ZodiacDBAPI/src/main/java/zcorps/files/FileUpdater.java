package zcorps.files;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Zachary Nichelson (Lurderker Etgur Avuli)
 */
public class FileUpdater {
    /**
     * Goes to a URL and downloads a specified file
     * @param url URL to search for file
     * @param path Path where you would like to download file,
     * @throws IOException May Throw IOException when attempting to retrieve and download file
     * Uses InputStream, url.openStream() and Files.copy()
     */
    public void download(URL url, String path, Logger log) throws IOException {
        try (InputStream in = url.openStream()) {
            log.log(Level.INFO, "Copying new files to C:/ZodiacCorps/"+path);
            Files.copy(in, Paths.get("C:/ZodiacCorps/" + path));
        }
    }

    public void update(String path, Logger log) {
        //URL url = new URL("");
        String url = "";
        log.log(Level.INFO, url + "located...downloading new files...");
        //download(url, path, log);
    }
}
