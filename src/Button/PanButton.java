package Button;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanButton extends JPanel {

    JButton drawcard = new JButton("Draw!!");

    public PanButton() {
        add(drawcard);
        class SBListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == drawcard) {
                    Cards cards = new Cards();
                    add(cards, BorderLayout.CENTER);
                }
            }
        }

        ActionListener sbListener = new SBListener();
        drawcard.addActionListener(sbListener);
    }
}
