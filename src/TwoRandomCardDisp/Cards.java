package TwoRandomCardDisp;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import javax.swing.JPanel;

public class Cards extends JPanel {

    int nWidth, nHeight, nRows, nColoms;
    BufferedImage[] sprites=SplitSprites();
    BufferedImage bigImg = null;
    int nRandomInt = (int) (Math.random() * 51) + 1;

    public BufferedImage[] SplitSprites() {
        try {
            bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
            e.getCause();
        }
        nWidth = 73;
        nHeight = 98;
        nRows = 4;
        nColoms = 13;
        sprites = new BufferedImage[nRows * nColoms];
        for (int i = 0; i < nRows; i++) { // split up sprite
            for (int j = 0; j < nColoms; j++) {
                sprites[(i * nColoms) + j] = bigImg.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);  
            }
        }
        return sprites;
    }
        public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(sprites[nRandomInt], null, 100, 100);
    }
}
