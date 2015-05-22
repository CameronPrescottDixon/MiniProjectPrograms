
package Display;

import Tests.*;
import javax.swing.*;
import java.awt.*;
public class PanMain extends JPanel {
    BigCards bigcards = new BigCards();
    public PanMain() {
        // this next line tells PanMain that it has a border layout.
        
        add(bigcards, BorderLayout.WEST);
        
    }
}
