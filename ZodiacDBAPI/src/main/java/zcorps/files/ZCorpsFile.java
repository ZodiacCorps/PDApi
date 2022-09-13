package zcorps.files;

import javax.swing.*;
import java.io.File;
import java.util.logging.Logger;

/**
 * @author Zachary Nichelson (Lurderker Etgur Avuli)
 */
public interface ZCorpsFile {
    /**
     * Converts .txt file to .zcorps file
     * @param f File that needs to be converted
     * @return Returns a new File
     */
    File convert(File f);

    /**
     * Creates a Zcorps file at the designated path
     * @param path Path that the file will be created at
     */
    void create(String path);

    /**
     * Creates a file with any extension to any path specified
     * @param path Path that the file will be created at
     * @param ext Extension of the file that you are going to be creating
     */
    void create(String path, String ext);

    void read(File file, Logger log, JTextArea content);
}
