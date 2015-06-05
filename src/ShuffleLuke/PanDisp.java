package ShuffleLuke;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel {

    LblCards lblCards = new LblCards();
    LblCards lblCards2 = new LblCards();
    LblCardsRemaining lblCR= new LblCardsRemaining();
    LblCardsRemaining lblCR2= new LblCardsRemaining();
    Hand hand = new Hand();
    
    int nCount=26;

    public PanDisp(PanOut _panOut) {
        setLayout(new BorderLayout());
        BtnDraw draw = new BtnDraw("Draw!!!");
        add(lblCards, BorderLayout.WEST);
        add(lblCards2, BorderLayout.EAST);
        add(draw, BorderLayout.SOUTH);
        
        lblCards.StartingCard();
        lblCards2.StartingCard();
        hand.Cards();
        hand.Hand1();
        hand.Hand2();
        
        evtDraw eD = new evtDraw(); // the event class will be defined later
        draw.addActionListener(eD);
    }

    public class evtDraw implements ActionListener { // must override the ActionPerformed method

        @Override
        public void actionPerformed(ActionEvent e) {
            int Player1 = hand.alnHand1.size(), Player2 = hand.alnHand2.size();
            int CardP1, CardP2;
            nCount--;
            CardP1 = lblCards.DrawCard(hand.alnHand1, nCount);
            CardP2 = lblCards2.DrawCard(hand.alnHand2, nCount);
//            System.out.println(nCount);
            if (CardP1 > CardP2) {
                hand.alnHand1.add(nCount);
                hand.alnHand2.remove(nCount);
            } else if (CardP1 < CardP2) {
                hand.alnHand2.add(nCount);
                hand.alnHand1.remove(nCount);
            }
            if(nCount==0 && Player1>Player2){
                nCount=Player2;
            }
            else if(nCount==1 && Player1<Player2){
                nCount=Player1;
            }
            System.out.println(Player1);
            System.out.println(Player2);
            lblCR.DisplayPoints(Player1);
            lblCR2.DisplayPoints(Player2);
        }
    }
}
