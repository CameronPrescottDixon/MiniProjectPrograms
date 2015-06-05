package Shuffle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel {

    LblCards lblCards = new LblCards();
    LblCards lblCards2 = new LblCards();
    Hand hand=new Hand();
    int Player1= hand.alnHand1.size(),Player2=hand.alnHand2.size();
    

    public PanDisp(PanOut _panOut) {
        setLayout(new BorderLayout());
        BtnDraw draw = new BtnDraw("Draw!!!");
        add(lblCards, BorderLayout.WEST);
        add(lblCards2, BorderLayout.EAST);
        add(draw, BorderLayout.SOUTH);
        lblCards.StartingCard();
        lblCards2.StartingCard();
        evtDraw eD = new evtDraw(); // the event class will be defined later
        draw.addActionListener(eD);
    }

    public class evtDraw implements ActionListener { // must override the ActionPerformed method

        @Override
        public void actionPerformed(ActionEvent e) {
            int CardP1,CardP2,nCount=26;
            CardP1=lblCards.DrawCard(hand.alnHand1,nCount);
            CardP2=lblCards.DrawCard(hand.alnHand2,nCount);
            nCount--;
            if (CardP1>CardP2){
                hand.alnHand1.add(CardP2);
                hand.alnHand2.remove(CardP2);
            }
            else if (CardP1<CardP2){
                hand.alnHand2.add(CardP1);
                hand.alnHand1.remove(CardP1);
        }
    }
}
