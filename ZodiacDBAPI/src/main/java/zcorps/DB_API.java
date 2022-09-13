package zcorps;

import zcorps.utils.ButtonFunctions;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Zachary Nichelson (Lurderker Etgur Avuli)
 *
 */
public class DB_API {
    public DB_API(){

    }

    /**
     * Setting up Locations, Component Visibility Etc...
     * @param text Database Search Bar
     * @param info Database Display / Edit Area
     * @param sp Scrollpane that the Info Panel will be inserted on
     * @param sBtn Search Button
     * @param dbBg Database Background
     * @param log Logger to log Exceptions etc...
     * @param setupProcess String[] used to track where the setup process is at (log)
     * @param htable Table to hold certain Information
     */
    public void setupDatabase(JTextField text, JTextArea info, JScrollPane sp, JButton sBtn, JLabel dbBg,
                              Logger log, String[] setupProcess, JTable htable){
        dbBg.setBounds(0,0, 630, 605);
        dbBg.setLayout(null);
        dbBg.setSize(880, 605);
        dbBg.setIcon(new ImageIcon("ZodiacCorpsLarge.png"));

        text.setBounds(25,25, 200,25);

        info.setBounds(50, 50, 500, 500);
        info.setEditable(false);
        info.setFont(new Font("", Font.PLAIN, 18));

        sp.setVisible(false);

        sp.setBounds(50, 50, 500, 500);


        sBtn.setLocation(75, 65);
        sBtn.setText("Search");

        htable.setBounds(0, 0, 250, 500);
        htable.setEnabled(false);


        log.log(Level.INFO, "Success, Continuing on " + setupProcess[4] + " setup...");
        log.log(Level.INFO, setupProcess[4] + " setup now...");
    }


}
