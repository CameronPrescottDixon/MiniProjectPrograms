package SixShuffle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel {
    //Note: as of the time in which this project has been handed in, the labels lblCards and lblCards2 are not working, or being displayed in the panel

    LblCards lblCards = new LblCards();
    LblCards lblCards2 = new LblCards();
    LblCardsRemaining lblCR = new LblCardsRemaining();
    LblCardsRemaining lblCR2 = new LblCardsRemaining();
    Hand hand = new Hand();

    int nCount = 26;

    public PanDisp(PanOut _panOut) {
        setLayout(new BorderLayout());
        BtnDraw btnDraw = new BtnDraw("Draw!!!");
        add(lblCards, BorderLayout.WEST);
        add(lblCards2, BorderLayout.EAST);
        add(btnDraw, BorderLayout.SOUTH);

        lblCards.StartingCard();
        lblCards2.StartingCard();
        hand.ShuffleCards();
        hand.Hand1();
        hand.Hand2();

        evtDraw eD = new evtDraw(); 
        btnDraw.addActionListener(eD); //Attach the EventListener to btnDraw
    }

    public class evtDraw implements ActionListener { // must override the ActionPerformed method

        @Override
        public void actionPerformed(ActionEvent e) {
            int nPlayer1CardCount = hand.alnHand1.size(), nPlayer2CardCount = hand.alnHand2.size(); //Initialize two ints- one equal to the size of Player 1's ArrayList (number of cards they have), and one equal to the size of Player 2's ArrayList
            int nCardP1, nCardP2; 
            nCount--; //Decrease nCount every time the button is pressed
            nCardP1 = lblCards.DrawCard(hand.alnHand1, nCount); //Call the DrawCard function from lblCards, and set its value as the int nCard1, using alnHand1
            nCardP2 = lblCards2.DrawCard(hand.alnHand2, nCount); //Call the DrawCard function from lblCards, and set its value as the int nCard2, using alnHand2
            if (nCardP1 > nCardP2) { //If the value of nCardP1 is greater than nCardP2
                hand.alnHand1.add(nCount); //Add the value of nCount to alnHand1
                hand.alnHand2.remove(nCount); //Remove the value of nCount from alnHand2
            } else if (nCardP1 < nCardP2) { //If the value of nCardP2 is greater than nCardP1
                hand.alnHand2.add(nCount);//Add the value of nCount to alnHand2
                hand.alnHand1.remove(nCount);//Remove the value of nCount from alnHand1
            }
            if (nCount == 0 && nPlayer1CardCount > nPlayer2CardCount) { //If nCount has reached 0, and nPlayer1CardCountCardCount is greater than nPlayer2CardCount
                //Note: if nCount = 0, no more cards will be drawn, regardless of whether or not the players have ran out of cards. So in order to prevent this from happening, set nCount as one of the values of the players' card counts, in order to continue playing
                nCount = nPlayer2CardCount; //Set nCount as nPlayer2CardCount
            } else if (nCount == 1 && nPlayer1CardCount < nPlayer2CardCount) {//If nCount has reached 0, and nPlayer2CardCountCardCount is greater than nPlayer1CardCount
                nCount = nPlayer1CardCount; //Set nCount as nPlayer1CardCount
            }
            System.out.println(nPlayer1CardCount); //Print out how many cards Player1 has
            System.out.println(nPlayer2CardCount); //Print out how many cards Player2 has
            lblCR.DisplayPoints(nPlayer1CardCount);
            lblCR2.DisplayPoints(nPlayer2CardCount);
        }
    }
}
