package zcorps.files;

import java.io.File;

public interface ZCorpsFile {
    File convert(File f);
    void create(String path);
    void create(String path, String ext);
}
