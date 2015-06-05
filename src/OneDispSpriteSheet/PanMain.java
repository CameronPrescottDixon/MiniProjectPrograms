
package OneDispSpriteSheet;

import javax.swing.*;
import java.awt.*;
public class PanMain extends JPanel {
    BigCards bigcards = new BigCards();
    public PanMain() {
         setLayout(new BorderLayout());
        add(bigcards, BorderLayout.CENTER);
        
    }
}
