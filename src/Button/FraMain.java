package Button;

import Button.*;
import javax.swing.*;
import java.awt.*;

public class FraMain extends JFrame{


    FraMain() {
        PanButton panButton = new PanButton();
        Cards cards = new Cards();
        setTitle("WAR!!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize((98 * 5), (73 * 5)); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        add(panButton);
        setVisible(true);
        setLayout(new BorderLayout());
        add(panButton, BorderLayout.NORTH);
        add(cards, BorderLayout.CENTER);
       
    }
}
