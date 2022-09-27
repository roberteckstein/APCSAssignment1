package com.shs;

import javax.swing.*;
import java.awt.*;

public class Hangil {
    private JFrame frame;
    private JPanel panel;
    public Hangil() {
        frame = new JFrame("Hangil Again");
        frame = new JFrame("java-chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(900, 600));
        frame.setResizable(false);
        frame.setFocusable(true);
        frame.setLocationRelativeTo(null);
        panel = new JPanel(new GridBagLayout());
        frame.add(panel);
        frame.setVisible(true);
    }
    public void addLabel(String text) {
        JLabel a = new JLabel("<html><font size=18>" + text + "</font></html>");
        panel.add(a);
    }
}
