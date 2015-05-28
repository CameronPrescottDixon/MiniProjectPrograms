package Button;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanButton extends JPanel {

    JButton BtnDrawCard = new JButton("Draw!!");

    public PanButton() {
        add(BtnDrawCard);
        class SBListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                if (event.getSource() == BtnDrawCard) {
                   
                }
            }
        }
        ActionListener sbListener = new SBListener();
        BtnDrawCard.addActionListener(sbListener);
    }
}
