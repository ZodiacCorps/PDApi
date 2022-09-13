package zcorps.utils;

import zcorps.DB_API;

import javax.swing.*;

/**
 * @author Zachary Nichelson (Lurderker Etgur Avuli)
 */
public class Navigation{

    /**
     * Setting Components to switch to and from the database to other areas within the program
     *
     * @param p1 Draw Surface 1 (Search Bar, Search Button, Etc...)
     * @param p2 Draw Surface 2 (htable(Important data will be here))
     * @param htable Table (will hold data)
     */
    public void switchDb(JPanel p1, JPanel p2, JTable htable){
        p2.setBounds(0, 145, 250, 500);
        p1.setVisible(true);
        p2.setVisible(true);
        htable.setVisible(true);
    }
}
