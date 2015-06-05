package ShuffleLuke_1;

import javax.swing.*;

public class LblCardsRemaining extends JLabel {
    //Note: at the time of handing in this project, lblCardsRemaining is not being displayed when the program is run

    JLabel LblRemaining = new JLabel(""); //Initialize label LblRemaining

    public void DisplayPoints(int nPlayer) {
        String sRemain;
        sRemain = Integer.toString(nPlayer);
        LblRemaining.setText(sRemain); 

    }

}
