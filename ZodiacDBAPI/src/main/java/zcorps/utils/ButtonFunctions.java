package zcorps.utils;

import javax.swing.*;

public class ButtonFunctions {
    public void openDbSearch(JButton closeMenu, JPanel p1, JPanel p2, JPanel p4, JPanel p5, JLabel dbBg,
                              JScrollPane sp){
        closeMenu.setText("<html><p>O<br>p<br>e<br>n</p></html>");
        p1.setVisible(false);
        p2.setVisible(false);
        p5.setLocation(0, 250);
        p4.setLocation(0,40);
        p4.setSize(880, 605);
        dbBg.setSize(880, 605);
        dbBg.setIcon(new ImageIcon("ZodiacCorpsLarge.png"));
        sp.setSize(780, 500);
    }

    public void closeDbSearch(JButton closeMenu, JPanel p1, JPanel p2, JPanel p4, JPanel p5, JLabel dbBg,
                               JScrollPane sp){
        closeMenu.setText("<html><p>C<br>l<br>o<br>s<br>e</p></html>");
        p1.setVisible(true);
        p2.setVisible(true);
        p5.setLocation(250, 250);
        p4.setLocation(250,40);
        p4.setSize(630, 605);
        dbBg.setSize(630, 605);
        dbBg.setIcon(new ImageIcon("ZodiacCorps.png"));
        sp.setSize(500, 500);
    }

}
