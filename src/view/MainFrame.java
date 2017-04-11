package view;

import controller.ExitWindowListener;
import controller.StudentController;
import model.Student;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by anonymous on 10.04.2017.
 */
public class MainFrame {
    private StudentController studentController;
    private String title;
    private Dimension d;
    private JFrame headFrame = new JFrame();
    private MenuBar headMenuBar = new MenuBar();
    private ToolBar headToolBar = new ToolBar(studentController);
    private TableOfStudents headTableOfStudents;

    public MainFrame(String title , Dimension d, StudentController studentController)
    {
        this.studentController=studentController;
        headFrame.setTitle(title);
        headFrame.setSize(d);
        headFrame.setLayout(new BorderLayout());
        headFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        headFrame.addWindowListener(new ExitWindowListener());
        headTableOfStudents.setPreferredSize(new Dimension(1900,800));


    }

    public void initMainFrame()
    {
        headFrame.add(headToolBar.initToolBar(), BorderLayout.NORTH);
        headFrame.add(headTableOfStudents.initTableOfStudents());
        headFrame.setJMenuBar(headMenuBar.initMenuBar());
        headFrame.pack();
        headFrame.setVisible(true);
    }
}
