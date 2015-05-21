package Tests;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Cards {

    private BufferedImage biSpriteSheet;

    public void LoopSub() throws IOException {
        int nWidth, nHeight, nRows, nColoms;
        BufferedImage[] sprites;
        BufferedImage bigImg;
        bigImg = ImageIO.read(new File("sheet.png"));
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
    }
}
