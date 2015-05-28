package RandomCardDisp;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    Cards cards = new Cards();

    public PanMain() {
        setLayout(new BorderLayout());
        add(cards, BorderLayout.CENTER);
    }
}
