package Tests;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanButton extends JPanel {

    BtnStart btnStart = new BtnStart("Start!");
    Boolean bIsClicked;

    public PanButton() {
        add(btnStart);


        class SBListener implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent event) {
                bIsClicked = true;
                //System.out.println("You clicked the button");
                //btnStart = null;
            }
        }
        ActionListener sbListener = new SBListener();
        btnStart.addActionListener(sbListener);
    }
}
