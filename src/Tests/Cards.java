package Tests;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.*;

public class Cards {

    private BufferedImage biSpriteSheet;

    public void paint(Graphics g) throws IOException {
        int nWidth, nHeight, nRows, nColoms;
        BufferedImage[] sprites;
        BufferedImage bigImg;
        bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        nWidth = 75;
        nHeight = 100;
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
