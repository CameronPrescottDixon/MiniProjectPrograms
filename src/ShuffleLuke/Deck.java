package ShuffleLuke;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class Deck {

    BufferedImage[] abiCards = SplitSprites();
    BufferedImage bigImg = null;
    int nWidth, nHeight, nRows, nColoms;

     public BufferedImage[] SplitSprites() {//Split the spritesheet into an array of images
        int nWidth, nHeight, nRows, nColoms;
        try {
            bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        nWidth = 73;
        nHeight = 98;
        nRows = 4;
        nColoms = 13;
        abiCards = new BufferedImage[nRows * nColoms];
        for (int i = 0; i < nRows; i++) { // split up sprite
            for (int j = 0; j < nColoms; j++) {
                abiCards[(i * nColoms) + j] = bigImg.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);
            }
        }
        return abiCards;
    }
}

