package Shuffle;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Hand {

    ArrayList<Integer> alnShuffle = new ArrayList<Integer>();
    ArrayList<Integer> alnCards = new ArrayList<Integer>();
    ArrayList<Integer> alnHand1 = new ArrayList<Integer>();
    ArrayList<Integer> alnHand2 = new ArrayList<Integer>();

    public void Hand(int nNum) {// populate cards with 52 ints (0-51)
        for (int i = 0; i < 52; i++) {
            alnCards.add(i);
        }
        alnShuffle = Deck.Shuffle(alnCards, alnShuffle);
        if (nNum == 1) { //If it's the first hand of cards only take this hand
            for (int i = 0; i < 26; i++) {
                alnHand1.add(alnShuffle.get(i));
                alnShuffle.remove(i);
        } 

        } else { //If it's the second hand of cards only take this hand
            for (int i = 26; i < 52; i++) {
                alnHand2.add(alnShuffle.get(i));
                alnShuffle.remove(i);
            }
        }
    }
}
