package zcorps.search;

import javax.swing.*;
import java.util.logging.Logger;

public interface Keyword {
    public final String[] PLANET_KEYS = {
            "pmats", "pmanufacture", "presources"
    };

    public final String PMATS = "pmats";
    public final String PMANUF = "pmanufacture";
    public final String PRES = "presources";

    public final String SKEYS = "skeys";
    public final String LOAD = "load";
    public final String DIR = "directory";

    void keywordSearch(JTextField searchArea, Logger log, JTextArea info);
}
