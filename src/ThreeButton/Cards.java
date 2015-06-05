package ThreeButton;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cards extends JButton {

    private ImageIcon icon;
    private ImageIcon tay;
    boolean bToggle = false;

    Cards(String file) {
        icon = new ImageIcon(file);
        icon.getImage();
        tay = new ImageIcon("url.jpg");
        tay.getImage();
        this.setIcon(icon);
        AL changeImage = new AL();
        this.addActionListener(changeImage);
    }

    class AL implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (bToggle == true) {
                setIcon(icon);
                bToggle = false;
                System.out.println(bToggle);
            } else {
                setIcon(tay);
                bToggle = true;
                System.out.println(bToggle);
            }
        }
    }
}
