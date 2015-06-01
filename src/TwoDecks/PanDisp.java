package TwoDecks;

import RndmCrdBtn.*;
import Button.*;
import javax.swing.*;
import java.awt.*;

public class PanDisp extends JPanel {

    public PanDisp(PanOut _panOut) {
        setLayout(new BorderLayout());
        Cards cards = new Cards();
        Cards2 cards2 = new Cards2();
        add(cards,BorderLayout.WEST);
        add(cards2,BorderLayout.EAST);
    }
}
