package RandomCardDisp;

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
    int nCardValue;
    ArrayList<int[]> aliAllCards=new ArrayList<>();
    ArrayList<int[]> aliP1Cards=new ArrayList<>();
    ArrayList<int[]> aliAICards=new ArrayList<>();

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

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        /*g2.drawImage(sprites[nRandomInt], null, 100, 100);
        System.out.println(nRandomInt+1);*/
        for(int i = 0; i<53; i++){
            nCardValue = i;
            g2.drawImage(sprites[nRandomInt], null,100, 100);
            System.out.println(nCardValue);
        }
    }
}
