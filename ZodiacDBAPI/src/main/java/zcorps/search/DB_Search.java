package zcorps.search;

import zcorps.files.ZFileHandler;

import javax.swing.*;
import java.io.File;
import java.util.logging.Logger;

public class DB_Search implements Keyword{
    ZFileHandler zfh = new ZFileHandler();

    @Override
    public void keywordSearch(JTextField searchArea, Logger log, JTextArea info) {
        searchPIndustry(searchArea, log, info);
        searchSupport(searchArea, log, info);
    }

    public void searchPIndustry(JTextField searchArea, Logger log, JTextArea info){
        switch(searchArea.getText()){
            case PMATS:
                File file = new File("C:/ZodiacCorps/Database/PlantaryIndustry/prawmats.txt");
                zfh.read(file, log, info);
                searchArea.setText("");
                return;
            case PRES:
                File pt1 = new File("C:/ZodiacCorps/Database/PlantaryIndustry/pmanufacture.txt");
                zfh.read(pt1, log, info);
                searchArea.setText("");
                return;
            case PMANUF:
                File presources = new File("C:/ZodiacCorps/Database/PlantaryIndustry/presources.txt");
                zfh.read(presources, log, info);
                searchArea.setText("");
                return;
        }
    }

    public void searchSupport(JTextField searchArea, Logger log, JTextArea info) {
        switch(searchArea.getText()) {
            case SKEYS:
                File skeys = new File("C:/ZodiacCorps/Database/PlantaryIndustry/prawmats.txt");
                zfh.read(skeys, log, info);
                searchArea.setText("");
                return;
            case LOAD:
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                    File f = fileChooser.getSelectedFile();
                    // load from file
                    zfh.read(f, log, info);

                }
            case DIR:
                File directory = new File("C:/ZodiacCorps/Database/PlantaryIndustry/prawmats.txt");
                zfh.read(directory, log, info);
                searchArea.setText("");
        }
    }
}
