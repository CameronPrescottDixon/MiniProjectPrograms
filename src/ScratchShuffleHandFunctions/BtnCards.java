package ScratchShuffleHandFunctions;

import javax.swing.*;

public class BtnCards extends JButton {

    private ImageIcon icon;

    public void StartingCard() {
        icon = new ImageIcon("card_back.png");
        icon.getImage();
        this.setIcon(icon);
    }
}

    
