package SixShuffle;

import java.awt.*;
import javax.swing.*;

public class PanMain extends JPanel {

    PanOut panOut = new PanOut(); //Create a new instance of PanOut
    PanDisp panDisp = new PanDisp(panOut);
    LblCardsRemaining lblCR = new LblCardsRemaining(); 
    LblCardsRemaining lblCR2 = new LblCardsRemaining();

    public PanMain() {
        setLayout(new BorderLayout());
        add(panDisp, BorderLayout.CENTER); //Initialize PanDisp in the center of the frame
        add(lblCR, BorderLayout.NORTH); //Initialize lblCR towards the top of the frame
        add(lblCR2, BorderLayout.NORTH); //INitialize lblCR towards the top of the frame
    }

}
