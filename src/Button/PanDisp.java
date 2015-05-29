package Button;

import javax.swing.*;
import java.awt.*;

public class PanDisp extends JPanel {

    public PanDisp(PanOut _panOut) {
        Cards cards = new Cards("PlayingCardsSpreadsheet.png");
        add(cards);
    }
}
