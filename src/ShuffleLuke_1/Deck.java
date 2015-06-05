package ShuffleLuke_1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Deck {

    BufferedImage[] abiCards = SplitSprites();
    BufferedImage bigImg = null;
    int nWidth, nHeight, nRows, nColumns;

    public BufferedImage[] SplitSprites() {//Split the spritesheet into an array of images
        int nWidth, nHeight, nRows, nColumns;
        try {
            bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        nWidth = 73;
        nHeight = 98;
        nRows = 4;
        nColumns = 13;
        abiCards = new BufferedImage[nRows * nColumns];
        for (int i = 0; i < nRows; i++) { // split up sprite
            for (int j = 0; j < nColumns; j++) {
                abiCards[(i * nColumns) + j] = bigImg.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight);
            }
        }
        return abiCards;
    }
}
