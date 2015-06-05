package ShuffleLuke_1;

import javax.swing.*;

public class LblCardsRemaining extends JLabel {

    JLabel LblRemaining = new JLabel("");

    public void DisplayPoints(int nPlayer) {
        String sRemain;
        sRemain = Integer.toString(nPlayer);
        LblRemaining.setText(sRemain);

    }

}
