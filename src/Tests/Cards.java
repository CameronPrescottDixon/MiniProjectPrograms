package Tests;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JPanel;

public class Cards extends JPanel {

    private BufferedImage biSpriteSheet;

    @Override
    public void paint(Graphics g) {
        int nWidth, nHeight, nRows, nColoms;
        BufferedImage[] sprites;
        BufferedImage bigImg = null;
        try {
            bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
//            Logger.getLogger(Cards.class.getName()).log(Level.SEVERE, null, ex);
        }
        nWidth = 73;
        nHeight = 98;
        nRows = 4;
        nColoms = 13;
        sprites = new BufferedImage[nRows * nColoms];

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColoms; j++) {
                sprites[i] = bigImg.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);
                Graphics2D g2 = (Graphics2D) g;
//                g2.drawImage(sprites[i], null, j * nWidth, i * nHeight);
                BufferedImage random = sprites[(int) (Math.random() * 52 + 1)];
                g2.drawImage(random, null, 0, 0);
            }
        }
//        for (int i = 0; i < 52; i++) {
//            Graphics2D g2 = (Graphics2D) g;
//            g2.drawImage(sprites[i], null, 100,100 );
//            
//        }
//        next section is to display a random card

    }
}
