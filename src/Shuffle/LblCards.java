package Shuffle;

import javax.swing.*;

public class LblCards extends JLabel {

    private ImageIcon icon;

    public void StartingCard() {
        icon = new ImageIcon("card_back.png");
        icon.getImage();
        this.setIcon(icon);
    }
}

    
