package zcorps.files;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUpdater {
    public void download(URL url, String path) throws Exception{
        try (InputStream in = url.openStream()) {
            Files.copy(in, Paths.get("C:/ZodiacCorps/" + path));
        }
    }
}
