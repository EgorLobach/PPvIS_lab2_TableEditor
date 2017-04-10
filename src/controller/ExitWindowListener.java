package controller;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by anonymous on 28.03.2017.
 */
public class ExitWindowListener implements WindowListener{
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int temp = JOptionPane.showConfirmDialog(new JFrame(),
                "Желаете выйти?", "Выход",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (temp == 0){
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
