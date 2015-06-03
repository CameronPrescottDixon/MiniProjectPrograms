package Shuffle;

import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;

public class BtnCards extends JButton {

    private ImageIcon icon;
    BufferedImage[] abiCards = SplitSprites();
    BufferedImage bigImg = null;
    static ArrayList<Integer> alnShuffle = new ArrayList<Integer>();
    ArrayList<Integer> alnCards = new ArrayList<Integer>();
    ArrayList<Integer> alnHand1 = new ArrayList<Integer>();
    ArrayList<Integer> alnHand2 = new ArrayList<Integer>();

    public BufferedImage[] SplitSprites() {
        int nWidth, nHeight, nRows, nColoms;
        try {
            bigImg = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
            e.getCause();
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

    public void StartingCard() {
        icon = new ImageIcon("card_back.png");
        icon.getImage();
        this.setIcon(icon);

    }

    public void Hand() {
        for (int i = 0; i < 52; i++) {
            alnCards.add(i);
        }
        alnShuffle = Shuffle(alnCards);
        for (int i = 0; i < 26; i++) {
            alnHand1.add(alnShuffle.get(i));
            alnShuffle.remove(i);
        }
        for (int i = 26; i < 52; i++) {
            alnHand2.add(alnShuffle.get(i));
            alnShuffle.remove(i);
        }
    }

    public static ArrayList Shuffle(ArrayList alnCards) {
        int nRand;
        for (int i = 0; i < alnCards.size(); i++) {
            nRand = (int) (Math.random() * alnCards.size());
            alnShuffle.add((Integer) alnCards.get(nRand));
            alnCards.remove(nRand);
        }
        return alnShuffle;
    }
}
