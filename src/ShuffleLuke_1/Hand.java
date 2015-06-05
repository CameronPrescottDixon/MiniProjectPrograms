package ShuffleLuke_1;

import java.util.ArrayList;

public class Hand {
    ArrayList<Integer> alnCards = new ArrayList<Integer>();//ArrayList of all 52 integers of cards, shuffled
    ArrayList<Integer> alnHand1 = new ArrayList<Integer>();//ArrayList of all of Player 1's shuffled cards
    ArrayList<Integer> alnHand2 = new ArrayList<Integer>();//ArrayList of all of Player 2's shuffled cards

    public void ShuffleCards() {
        for (int i = 0; i < 52; i++) {//Loop 52 times for 52 cards
            int nRand = (int) (Math.random() * 52); //Set a random integer between 1 and 51, the number of cards in a deck
            alnCards.add(nRand); //Add that card value to the ArrayList of all cards.
        }
    }

    public ArrayList<Integer> Hand1() {
        for (int i = 0; i < 26; i++) {//Loop 26 times to add 26 cards
            alnHand1.add(alnCards.get(i)); //Add 26 of the cards from the shuffled ArrayList of cards (alnCards) into Player 1's ArrayList of cards, alnHand1
        }
        return alnHand1;
    }

    public ArrayList<Integer> Hand2() {
        for (int i = 26; i < 52; i++) {//Loop 26 times to add 26 cards
            alnHand2.add(alnCards.get(i)); //Add 26 of the cards from the shuffled ArrayList of cards (alnCards) into Player 2's ArrayList of cards, alnHand2
        }
        return alnHand1;
    }
}
