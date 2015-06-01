package CardArray;

import TwoDecks.*;
import RndmCrdBtn.*;
import Button.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Cards extends JButton {

    private ImageIcon icon;
    private ImageIcon tay;
    boolean bToggle = false;
    int random;
    int nWidth, nHeight, nRows, nColoms;
    BufferedImage[] sprites = SplitSprites();
    BufferedImage bigImg = null;

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

    Cards(String file) {
        icon = new ImageIcon(file);
        icon.getImage();
        tay = new ImageIcon(sprites[random]);
        tay.getImage();
        this.setIcon(icon);
        AL changeImage = new AL();
        this.addActionListener(changeImage);
    }

    class AL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (bToggle == true) {
                random = Random();
                icon = new ImageIcon(sprites[random]);
                setIcon(icon);
                bToggle = false;
            } else {
                random = Random();
                tay = new ImageIcon(sprites[random]);
                setIcon(tay);
                bToggle = true;
            }
        }
    }

    public int Random() {
        int nRandomInt = (int) (Math.random() * 51) + 1;
        return nRandomInt;
    }
}
