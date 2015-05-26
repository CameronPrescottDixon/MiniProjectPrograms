package Tests;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
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
                sprites[i] = bigImg.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);
                //g2.drawImage(sprites[i], null, j * nWidth, i * nHeight); //Print sprites at I
            }
        }
//        Arrays.asList(sprites);
//        System.out.println(Arrays.asList(sprites)); //We have Problem spliting image
        //For some reason the sprites array is only reciving the card on the end of each row (Kings)
        return sprites;
        
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(sprites[4], null, 100, 100);
        System.out.println(nRandomInt);
    }
}
