
package Tests;

import javax.swing.*;
import java.awt.*;
public class PanMain extends JPanel {
    Cards cards = new Cards();
    public PanMain() {
        // this next line tells PanMain that it has a border layout.
         setLayout(new BorderLayout());
        add(cards, BorderLayout.CENTER);
        
    }
}
