package ButtonTest;
import javax.swing.*;
import java.awt.*;
public class BtnStart extends JButton {
    //private Color c;
    private String sLabel;
    public BtnStart(String _sLabel) {
        sLabel = "Start!";
        this.setText(sLabel);
    }
}
