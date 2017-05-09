import controller.StudentController;
import model.StudentDataBase;
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
                StudentDataBase studentDataBase = new StudentDataBase();
                StudentController studentController = new StudentController(studentDataBase);
                MainFrame mainFrame = new MainFrame("Frame", new Dimension(1200, 430), studentController);
                mainFrame.initMainFrame();
            }
        });

    }
}
