package ShuffleG;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanDisp extends JPanel {

    BtnCards btnCards = new BtnCards();
    BtnCards btnCards2 = new BtnCards();

    public PanDisp(PanOut _panOut) {
        setLayout(new BorderLayout());
        BtnDraw draw = new BtnDraw("Draw!!!");
        add(btnCards, BorderLayout.WEST);
        add(btnCards2, BorderLayout.EAST);
        add(draw, BorderLayout.SOUTH);
        btnCards.StartingCard();
        btnCards2.StartingCard();
        evtDraw eD = new evtDraw(); // the event class will be defined later
        draw.addActionListener(eD);
    }

    public class evtDraw implements ActionListener { // must override the ActionPerformed method

        public void actionPerformed(ActionEvent e) {
        }
    }
}
