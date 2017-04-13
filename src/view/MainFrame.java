package view;

import controller.*;
import model.Address;
import model.Student;
import model.StudentDataBase;

import javax.swing.*;
import java.awt.*;

/**
 * Created by anonymous on 10.04.2017.
 */
public class MainFrame {
    private StudentController studentController;
    private StudentDataBase studentDataBase;
    private Dimension d;

    //MenuBar
    private JMenu studentMenu = new JMenu("Студент");
    private JMenu fileMenu = new JMenu("Файл");
    private JMenuItem searchMenuItem = new JMenuItem("Найти");
    private JMenuItem deleteMenuItem = new JMenuItem("Удалить");
    private JMenuItem exitMenuItem = new JMenuItem("Выход");
    private JMenuItem openMenuItem = new JMenuItem("Открыть");
    private JMenuItem addStudentMenuItem = new JMenuItem("Добавить");
    private JMenuItem saveMenuItem = new JMenuItem("Сохранить");
    private JMenuBar menuBar =new JMenuBar();

    //ToolBar
    private JToolBar toolBar = new JToolBar(SwingConstants.HORIZONTAL);
    private JButton openButton = new JButton(new ImageIcon("resources/png/24x24/Folder.png"));
    private JButton addButton = new JButton(new ImageIcon("resources/png/24x24/Add.png"));
    private JButton saveButton = new JButton(new ImageIcon("resources/png/24x24/Save.png"));
    private JButton searchButton = new JButton(new ImageIcon("resources/png/24x24/View.png"));
    private JButton deleteButton = new JButton(new ImageIcon("resources/png/24x24/Delete.png"));
    private JButton refreshButton = new JButton(new ImageIcon("resources/png/24x24/Refresh.png"));
    private JButton exitButton = new JButton(new ImageIcon("resources/png/24x24/Exit.png"));


    private JFrame headFrame = new JFrame();
    private TableOfStudents tableOfStudents;

    public MainFrame(String title, Dimension d, StudentController studentController)
    {
        this.studentController=studentController;
        this.studentDataBase=studentController.getStudentDataBase();
        headFrame.setTitle(title);
        headFrame.setSize(d);
        headFrame.setLayout(new BorderLayout());
        headFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        headFrame.addWindowListener(new ExitWindowListener());
        tableOfStudents = new TableOfStudents(studentDataBase);
        tableOfStudents.setPreferredSize(new Dimension(1900,800));
        for (int i=1;i<=55;i++)
        {
            studentController.addStudent(new Student(String.valueOf(i), String.valueOf(i),String.valueOf(i),
                    String.valueOf(i),String.valueOf(i),String.valueOf(i),String.valueOf(i),i,i,i));
        }


    }

    public void initMainFrame()
    {
        //MenuBar
        exitMenuItem.addActionListener(new ExitActionListener());
        addStudentMenuItem.addActionListener(e -> {
            AddStudentDialog addStudentDialog = new AddStudentDialog(studentController, MainFrame.this);
            addStudentDialog.initAddStudentDialog();
        } );
        searchMenuItem.addActionListener(e -> {
            SearchStudentDialog searchStudentDialog = new SearchStudentDialog(studentController, MainFrame.this);
            searchStudentDialog.initSearchStudentDialog();
        });
        deleteMenuItem.addActionListener(e -> {
            DeleteStudentDialog deleteStudentDialog = new DeleteStudentDialog(studentController, MainFrame.this);
            deleteStudentDialog.initDeleteStudentDialog();
        });
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        exitMenuItem.addActionListener(new ExitActionListener());
        fileMenu.add(exitMenuItem);
        studentMenu.add(searchMenuItem);
        studentMenu.add(deleteMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(studentMenu);

        //ToolBar
        openButton.setSize(24,24);
        addButton.setSize(24,24);
        saveButton.setSize(24,24);
        searchButton.setSize(24,24);
        deleteButton.setSize(24,24);
        refreshButton.setSize(24,24);
        exitButton.setSize(24,24);
        exitButton.addActionListener(new ExitActionListener());
        addButton.addActionListener(e -> {
            AddStudentDialog addStudentDialog = new AddStudentDialog(studentController, MainFrame.this);
            addStudentDialog.initAddStudentDialog();
        } );
        searchButton.addActionListener(e -> {
            SearchStudentDialog searchStudentDialog = new SearchStudentDialog(studentController, MainFrame.this);
            searchStudentDialog.initSearchStudentDialog();
        });
        deleteButton.addActionListener(e -> {
            DeleteStudentDialog deleteStudentDialog = new DeleteStudentDialog(studentController, MainFrame.this);
            deleteStudentDialog.initDeleteStudentDialog();
        });
        refreshButton.addActionListener(e ->{
            updateMainFrame();
        });
        toolBar.add(openButton);
        toolBar.add(saveButton);
        toolBar.add(addButton);
        toolBar.add(searchButton);
        toolBar.add(deleteButton);
        toolBar.add(refreshButton);
        toolBar.add(exitButton);


        headFrame.add(toolBar, BorderLayout.NORTH);
        headFrame.add(tableOfStudents.initTableOfStudents());
        headFrame.setJMenuBar(menuBar);

        headFrame.pack();
        headFrame.setVisible(true);
    }


    public void updateMainFrame(){
        tableOfStudents.reloadTableOfStudent(studentDataBase);
        tableOfStudents.updateUI();
    }

}
