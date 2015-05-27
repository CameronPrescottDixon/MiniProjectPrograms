package DispSpriteSheet;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;

public class BigCards extends JPanel {

    private Image Cardsheet = null;

    public void paint(Graphics g) {
        try {
            Cardsheet = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
        }
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(Cardsheet, 0, 0, 950, 392, this);
    }
}
