package view;

import controller.*;
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
    private String title;
    private Dimension d;

    //MenuBar
    private JMenu searchMenu = new JMenu("Найти");
    private JMenuItem searchByHouseNumberAndLastName = new JMenuItem("По номеру дома и фамилии");
    private JMenuItem searchByStreetAndApartment = new JMenuItem("По улице и квартире");
    private JMenuItem searchByNameAndNumbersFoundInTheRoomNumber = new JMenuItem("По фамилии и цифрам встречающемся в номере дома");
    private JMenu deleteMenu = new JMenu("Удалить");
    private JMenuItem deleteByHouseNumberAndLastName = new JMenuItem("По номеру дома и фамилии");
    private JMenuItem deleteByStreetAndApartment = new JMenuItem("По улице и квартире");
    private JMenuItem deleteByNameAndNumbersFoundInTheRoomNumber = new JMenuItem("По фамилии и цифрам встречающемся в номере дома");
    private JMenuItem exitMenuItem = new JMenuItem("Выход");
    private JMenu fileMenu = new JMenu("Файл");
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

    public MainFrame(String title, Dimension d, StudentController studentController, StudentDataBase studentDataBase)
    {
        studentDataBase.add(new Student("Лобач", "Егор","Валентинович","Беларусь",
                "Минская область", "Минск", "Ташкентская", 18,4,81));
        this.studentController=studentController;
        this.studentDataBase=studentDataBase;
        headFrame.setTitle(title);
        headFrame.setSize(d);
        headFrame.setLayout(new BorderLayout());
        headFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        headFrame.addWindowListener(new ExitWindowListener());
        tableOfStudents = new TableOfStudents(studentDataBase);
        tableOfStudents.setPreferredSize(new Dimension(1900,800));


    }

    public void initMainFrame()
    {
        //MenuBar
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(addStudentMenuItem);
        fileMenu.addSeparator();
        searchMenu.add(searchByHouseNumberAndLastName);
        searchMenu.add(searchByStreetAndApartment);
        searchMenu.add(searchByNameAndNumbersFoundInTheRoomNumber);
        deleteMenu.add(deleteByHouseNumberAndLastName);
        deleteMenu.add(deleteByStreetAndApartment);
        deleteMenu.add(deleteByNameAndNumbersFoundInTheRoomNumber);
        exitMenuItem.addActionListener(new ExitActionListener());
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);
        menuBar.add(searchMenu);
        menuBar.add(deleteMenu);

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
            AddStudentDialog addStudentDialog = new AddStudentDialog(studentController);
            addStudentDialog.initAddStudentDialog();
        } );
        searchButton.addActionListener(e -> {
            SearchStudentDialog searchStudentDialog = new SearchStudentDialog();
            searchStudentDialog.initSearchStudentDialog();
        });
        deleteButton.addActionListener(e -> {
            DeleteStudentDialog deleteStudentDialog = new DeleteStudentDialog();
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
