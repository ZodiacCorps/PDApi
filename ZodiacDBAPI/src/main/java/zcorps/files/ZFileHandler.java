package zcorps.files;

import javax.swing.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Zachary Nichelson (Lurderker Etgur Avuli)
 */
public class ZFileHandler implements ZCorpsFile{

    /**
     * Reads a .zcorps file then takes the contents of the file, inserting them into
     * a JTextArea of your choice
     *
     * @param file File that needs to be read with java FileReader
     * @param log Logging possible IOException
     * @param content JTextArea to display contents of .zcorps file
     */
    public void read(File file, Logger log, JTextArea content){
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int cnt = 0;
            while ((cnt = fr.read()) != -1) {


                Scanner fileReaderScan=new Scanner(fr);

                //Create a String that will store all text in the text file
                String storeAllString="";

                //Put all text from text file into created String
                while(fileReaderScan.hasNextLine())
                {
                    String temp=fileReaderScan.nextLine()+"\n";

                    storeAllString=storeAllString+temp;
                }
                content.setText(storeAllString);
            }
        } catch (IOException e) {
            e.printStackTrace();
            log.log(Level.SEVERE, "IOException thrown ZFileHandler.java Line 16");
        }
    }

    /**
     * Converts .txt to a .zcorps file
     * @param f File that is going to be converted
     * @return return new File(f.getParent(), name + ".zcorps"
     */
    @Override
    public File convert(File f) {
        int i = f.getName().lastIndexOf('.');
        String name = f.getName().substring(0,i);
        return new File(f.getParent(), name + ".zcorps");
    }

    /**
     * Allows you to specifically create a .zcorps file
     * @param path Path of where you would like to create the file ("C:/ZodiacCorps/" + path + ".zcorps")
     */
    @Override
    public void create(String path) {
        try{
            File file = new File("C:/ZodiacCorps/" + path + ".zcorps");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    /**
     * Allows you to create a file with any extension
     * @param path Path of where you would like to create the file ("C:/ZodiacCorps/" + path + "." + ext)
     * @param ext Extension of where you would like to create the file ("C:/ZodiacCorps/" + path + "." + ext)
     */
    @Override
    public void create(String path, String ext) {
        try{
            File file = new File("C:/ZodiacCorps/" + path + "." + ext);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
