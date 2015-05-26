package ButtonTest;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanButton extends JPanel {

    Boolean bIsClicked;
    JButton drawcard = new JButton("Draw!!");

    public PanButton() {
        add(drawcard);
        class SBListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                bIsClicked = true;
                if (bIsClicked == true) {
                    Cards cards = new Cards();
                    add(cards, BorderLayout.CENTER);
                }
            }
        }

        ActionListener sbListener = new SBListener();
        drawcard.addActionListener(sbListener);
    }
}
