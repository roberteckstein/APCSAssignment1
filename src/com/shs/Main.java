package com.shs;

import javax.swing.*;

/*  Congratulations! If you see this code, then you've
    connected to the repository correctly. Run this
    program and watch what happens.
 */
public class Main {

    public static void main(String[] args) {

        //  This is a test project from Mr. Bob. It
        //  creates a JFrame object, sizes it, and
        //  displays it on the screen. If the user
        //  closes the frame using the control in the
        //  title bar, the program should exit.

        JFrame f = new JFrame("A Window");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);

        //  We will go over the update/commit/push cycle
        //  next week. If you know what you're doing, go
        //  ahead and add some code below and commit and
        //  push. If not, or you get a conflict, don't
        //  worry about it. We'll talk more about it next
        //  week.

        JOptionPane.showMessageDialog(null, "Mr. Bob Was Here");
        JOptionPane.showMessageDialog(null, "T. Smith eats scorpions (yuck)");

    }
}
