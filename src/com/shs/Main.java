package com.shs;

import javax.swing.*;
import java.awt.*;

/*  Congratulations! If you see this code, then you've
    connected to the repository correctly. Run this
    program and watch what happens.
 */
public class Main {

    public static void main(String[] args) {
        //lag_machine();

        BufordVanStom s1 = new BufordVanStom();
        s1.addNerd(23.4);

        CyrusHo h1 = new CyrusHo("Anime1", 2, 1);

        DeansClass d1 = new DeansClass("Test", "Test2", 1);

        Fil f = new Fil(1, 2, 3, 4, 5, 6, 7,
                "h", "i", "j", "k", "l", "m", "n",
                1.1, 1.2);

        Hangil h = new Hangil();

        Chris c = new Chris(" ", " ", "Jesus", 0);
        System.out.println(c.firstName);
        System.out.println(c.lastName);
        System.out.println(c.faithStatement);
        System.out.println(c.age);
        // Unsure if this works on IntelliJ, currently using Repl. Will check Thursday, then ask Mr. Eckstein if it still doesn't.
      
        Landon l = new Landon("First", "Last", 18);

        Marge m = new Marge(21, "Hello");

            /* This is a test project from Mr. Bob. It
            creates a JFrame object, sizes it, and
            displays it on the screen. If the user
            closes the frame using the control in the
            title bar, the program should exit.
            */
    }
/*
        JFrame f = new JFrame("A Window");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);


        JOptionPane.showMessageDialog(null, "Mr. Bob Was Here");
        JOptionPane.showMessageDialog(null, "Dean was here");
        JOptionPane.showMessageDialog(null, "T. Smith eats scorpions (yuck)");

        // Derek
        Fil fil = new Fil (1,2,23,65,21,57,21,"SFDSF","DSAD","SDJ", "DSADSWE","HI","BYE", "WHOOPE", 123.12,13213.2);
        fil.print();
        Hangil h = new Hangil();
        h.addLabel("lkasjhdfjklaasdfh");
        // hangil
        JFrame f1 = new JFrame("Hangil");
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setSize(600, 400);
        f1.setLocationRelativeTo(null);
        JPanel p = new JPanel();
        p.setLayout(new GridBagLayout());
        JLabel l = new JLabel("<html><font size='+5' color='red'>Hello world!</font></html>");

        JButton b = new JButton("Color");
        b.setPreferredSize(new Dimension(100, 25));
        b.addActionListener(a -> {
            if (l.getText().equals("<html><font size='+5' color='red'>Hello world!</font></html>")) {
                l.setText("<html><font size='+5' color='blue'>Hello world!</font></html>");
            } else {
                l.setText("<html><font size='+5' color='red'>Hello world!</font></html>");
            }
        });
        p.add(l);
        p.add(b);
        f1.add(p);
        f1.setVisible(true);
    } */
    /* public static void lag_machine () {
        try {
            lag_machine();
        }
        catch (StackOverflowError e)
        {
            System.out.println("oops");
            lag_machine();
        }

    } */
}
