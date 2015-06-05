package ShuffleLuke_1;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Deck {

    BufferedImage[] abiCards = SplitSprites(); //Array of BufferedImages
    BufferedImage bigImg = null;
    int nWidth, nHeight, nRows, nColumns;

    public BufferedImage[] SplitSprites() {//Split the spritesheet into an array of images
        int nWidth, nHeight, nRows, nColumns;
        try {
            bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png")); //Read in the entire SpriteSheet
        } catch (IOException e) {
            e.printStackTrace();
        }
        nWidth = 73; //Width of one card
        nHeight = 98; //Height of one card
        nRows = 4; //Number of rows in the SpriteSheet
        nColumns = 13; //Number of columns in the Spritesheet
        abiCards = new BufferedImage[nRows * nColumns];
        for (int i = 0; i < nRows; i++) { // split up sprite
            for (int j = 0; j < nColumns; j++) {
                abiCards[(i * nColumns) + j] = bigImg.getSubimage((j * nWidth), (i * nHeight), nWidth, nHeight); //Split up the SpriteSheet into smaller cards, and adding them into an array of Buffered Images
            }
        }
        return abiCards;
    }
}
