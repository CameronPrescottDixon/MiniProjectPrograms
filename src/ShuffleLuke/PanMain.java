
package ShuffleLuke;

import java.awt.*;
import javax.swing.*;


public class PanMain extends JPanel{
    PanOut panOut = new PanOut();
    PanDisp panDisp = new PanDisp(panOut);
    LblCardsRemaining lblCR= new LblCardsRemaining();
    LblCardsRemaining lblCR2= new LblCardsRemaining();

    public PanMain() {
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER);
        add(lblCR, BorderLayout.NORTH);
        add(lblCR2, BorderLayout.NORTH);
    }
    
}
