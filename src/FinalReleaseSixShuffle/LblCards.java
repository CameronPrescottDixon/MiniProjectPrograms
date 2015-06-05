package FinalReleaseSixShuffle;

import java.util.ArrayList;
import javax.swing.*;

public class LblCards extends JLabel {

    private ImageIcon icon;

    public void StartingCard() {
        icon = new ImageIcon("card_back.png");//Load in the image of the back of a playing card
        icon.getImage();
        this.setIcon(icon); //Set the initial images to be of the back of a playing card
    }

    Deck deck = new Deck();

    public int DrawCard(ArrayList<Integer> alnCards, int nCardtoDraw) {
        int nCard;
        nCard = alnCards.get(nCardtoDraw); //Initialize nCard as the value of alnCards at the index of nCardtoDraw, which is initialized when the DrawCard function is called in the EventListener in PanDisp
        icon = new ImageIcon(deck.abiCards[nCard]); //Initialize the card as the image at index of nCard value in the array of BufferedImages, abiCards
        setIcon(icon); 
        return nCard;
    }
}
