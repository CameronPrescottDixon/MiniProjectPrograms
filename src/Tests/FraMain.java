package Tests;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FraMain extends JFrame {

    FraMain() {
        PanMain panMain = new PanMain();
        Cards cards = new Cards();
        setTitle("WAR!!!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600); //1370, 730 for fullscreen for laptop
        this.setResizable(true);
        setLocationRelativeTo(null);
        add(panMain);
        setVisible(true);
        

    }
}