package Tests;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
import javax.swing.JPanel;

public class Cards extends JPanel {

    int nWidth, nHeight, nRows, nColoms;
    BufferedImage[] sprites;
    BufferedImage bigImg = null;

    public void SplitSprites() {

        try {
            bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
        }
        nWidth = 73;
        nHeight = 98;
        nRows = 4;
        nColoms = 13;
        sprites = new BufferedImage[nRows * nColoms];
        for (int i = 0; i < nRows; i++) { // split up sprite
            for (int j = 0; j < nColoms; j++) {
                sprites[i] = bigImg.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);
                //g2.drawImage(sprites[i], null, j * nWidth, i * nHeight); //Print sprites at I
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        int nRandomInt;
        Graphics2D g2 = (Graphics2D) g;
        nRandomInt = (int) (Math.random() * 51) + 1;
        g2.drawImage(sprites[nRandomInt], null, 100, 100);
        System.out.println(nRandomInt);
    }
}
