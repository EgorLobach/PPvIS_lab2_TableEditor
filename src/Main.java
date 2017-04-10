import view.MainFrame;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anonymous on 10.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame("Frame", new Dimension(1900, 900));
                mainFrame.initMainFrame();
            }
        });
    }
}
