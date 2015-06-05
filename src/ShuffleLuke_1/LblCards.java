package ShuffleLuke_1;

import java.util.ArrayList;
import javax.swing.*;

public class LblCards extends JLabel {

    private ImageIcon icon;

    public void StartingCard() {
        icon = new ImageIcon("card_back.png");
        icon.getImage();
        this.setIcon(icon); //Set the initial images to be of the back of a playing card
    }

    Deck deck = new Deck();

    public int DrawCard(ArrayList<Integer> alnCards, int nCardtoDraw) {
        int nCard;
        nCard = alnCards.get(nCardtoDraw);
        icon = new ImageIcon(deck.abiCards[nCard]);
        setIcon(icon);

        return nCard;
    }
}
