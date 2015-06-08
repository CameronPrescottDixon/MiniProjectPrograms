package FinalReleaseSixShuffle;

import java.util.ArrayList;

public class Hand {

    int nRand;
    ArrayList<Integer> alnCards = new ArrayList<Integer>();//ArrayList of all 52 integers of cards, shuffled
    ArrayList<Integer> alnShuffle = new ArrayList<Integer>();//ArrayList of all 52 integers of cards, shuffled
    ArrayList<Integer> alnHand1 = new ArrayList<Integer>();//ArrayList of all of Player 1's shuffled cards
    ArrayList<Integer> alnHand2 = new ArrayList<Integer>();//ArrayList of all of Player 2's shuffled cards

    public void ShuffleCards() {
        for (int i = 0; i < 52; i++) {
            alnCards.add(i);
        }
        System.out.println(alnCards);
        System.out.println(alnCards.size());
        for (int i = 0; i < 52; i++) {
            nRand = (int) (Math.random() * (alnCards.size()-1));
            alnShuffle.add((Integer) alnCards.get(nRand));
            alnCards.remove(nRand);
            System.out.println("i is " + i + " and nRand is " + nRand + " size is "+ alnCards.size());
            
        }
        System.out.println(alnShuffle);
    }

    public ArrayList<Integer> Hand1() {
        for (int i = 0; i < 26; i++) {//Loop 26 times to add 26 cards
            alnHand1.add(alnShuffle.get(i)); //Add 26 of the cards from the shuffled ArrayList of cards (alnCards) into Player 1's ArrayList of cards, alnHand1
        }
        return alnHand1;
    }

    public ArrayList<Integer> Hand2() {
        for (int i = 26; i < 52; i++) {//Loop 26 times to add 26 cards
            alnHand2.add(alnShuffle.get(i)); //Add 26 of the cards from the shuffled ArrayList of cards (alnCards) into Player 2's ArrayList of cards, alnHand2
        }
        return alnHand1;
    }
}
