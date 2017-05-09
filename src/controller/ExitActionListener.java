package controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by anonymous on 28.03.2017.
 */
public class ExitActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        int temp = JOptionPane.showConfirmDialog(new JFrame(),
                "Желаете выйти?", "Выход",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (temp == 0)
            System.exit(1);
    }
}
