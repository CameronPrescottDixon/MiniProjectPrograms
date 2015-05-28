package Button;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cards extends JButton {

    private ImageIcon icon;

    Cards(String file) {
        icon = new ImageIcon(file);
        icon.getImage();
        this.setIcon(icon);
    }
}
