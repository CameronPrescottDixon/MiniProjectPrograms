
package ReleaseFiveTwoDecks;

import java.awt.*;
import javax.swing.*;


public class PanMain extends JPanel{
    PanOut panOut = new PanOut();
    PanDisp panDisp = new PanDisp(panOut);
    private PanOut PanOut;

    public PanMain() {
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER);
    }
    
}
