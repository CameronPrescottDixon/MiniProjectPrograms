package ButtonTest;

import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class Main {

    private Graphics g;
    int nandom;

    public static void main(String[] args) {
        JFrame frame1 = new JFrame("Da Button");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton drawcard = new JButton("Draw!!!");
        //Add action listener to button
        drawcard.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int nRandom = (int) (Math.random() * 51 + 1);
                System.out.println(nRandom);
            }
        });
        frame1.getContentPane().add(drawcard);
        frame1.pack();
        frame1.setVisible(true);
    }
}
