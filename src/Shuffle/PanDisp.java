package Shuffle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel {

    LblCards lblCards = new LblCards();
    LblCards lblCards2 = new LblCards();
    

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
        }
    }
}
