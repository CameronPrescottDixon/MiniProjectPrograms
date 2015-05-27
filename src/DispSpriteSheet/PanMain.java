
package DispSpriteSheet;

import DispSpriteSheet.*;
import javax.swing.*;
import java.awt.*;
public class PanMain extends JPanel {
    BigCards bigcards = new BigCards();
    public PanMain() {
        // this next line tells PanMain that it has a border layout.
         setLayout(new BorderLayout());
        add(bigcards, BorderLayout.CENTER);
        
    }
}
