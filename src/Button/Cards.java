package Button;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Cards extends JPanel {

    private Image Icon = null;
    String sImage = "PlayingCardsSpreadsheet.png";

    @Override
    public void paint(Graphics g) {
        try {
            Icon = ImageIO.read(new File("PlayingCardsSpreadsheet.png"));
        } catch (IOException e) {
        }
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(Icon, 0, 0, 950, 392, this);
        System.out.println();
    }
}
