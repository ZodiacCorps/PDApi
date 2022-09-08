package zcorps.utils;

import javax.swing.*;

public class Navigation {
    public void switchDb(JPanel p1, JPanel p2, JTable htable){
        p2.setBounds(0, 145, 250, 500);
        p1.setVisible(true);
        p2.setVisible(true);
        htable.setVisible(true);
    }
}
