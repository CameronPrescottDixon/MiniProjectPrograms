package RandomCardDisp;

import javax.swing.*;
import java.awt.*;

public class PanMain extends JPanel {

    Cards cards = new Cards();

    //PanButton panButton = new PanButton();

    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        setLayout(new BorderLayout());
        add(cards, BorderLayout.CENTER);
    }
}
