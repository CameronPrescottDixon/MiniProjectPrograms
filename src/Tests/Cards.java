package Tests;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        } catch (IOException ex) {
            Logger.getLogger(Cards.class.getName()).log(Level.SEVERE, null, ex);
        }
        nWidth = 950/13;
        nHeight = 392/4;
        nRows = 4;
        nColoms = 13;
        sprites = new BufferedImage[nRows * nColoms];
        
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < nColoms; j++) {
                sprites[i] = bigImg.getSubimage(j * nWidth, i * nHeight, nWidth, nHeight);
            }
        }
        for (int i = 0; i < 52; i++) {
            Graphics2D g2 = (Graphics2D) g;
            g2.drawImage(sprites[i], null, 100, 100);
        }
    }
}
