package view;

import controller.ExitActionListener;
import controller.ExitWindowListener;
import controller.StudentController;
import model.Student;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by anonymous on 10.04.2017.
 */
public class MainFrame {
    private StudentController studentController;

    private Random randomGenerator = new Random();

    private JMenu studentMenu = new JMenu("Студент");
    private JMenu fileMenu = new JMenu("Файл");
    private JMenuItem searchMenuItem = new JMenuItem("Найти");
    private JMenuItem deleteMenuItem = new JMenuItem("Удалить");
    private JMenuItem exitMenuItem = new JMenuItem("Выход");
    private JMenuItem openMenuItem = new JMenuItem("Открыть");
    private JMenuItem addStudentMenuItem = new JMenuItem("Добавить");
    private JMenuItem saveMenuItem = new JMenuItem("Сохранить");
    private JMenuBar menuBar = new JMenuBar();

    private JToolBar toolBar = new JToolBar(SwingConstants.HORIZONTAL);
    private JButton openButton = new JButton(new ImageIcon("resources/png/24x24/Folder.png"));
    private JButton addButton = new JButton(new ImageIcon("resources/png/24x24/Add.png"));
    private JButton saveButton = new JButton(new ImageIcon("resources/png/24x24/Save.png"));
    private JButton searchButton = new JButton(new ImageIcon("resources/png/24x24/View.png"));
    private JButton deleteButton = new JButton(new ImageIcon("resources/png/24x24/Delete.png"));
    private JButton exitButton = new JButton(new ImageIcon("resources/png/24x24/Exit.png"));

    private JFrame headFrame = new JFrame();
    private TableOfStudents tableOfStudents;

    public MainFrame(String title, Dimension d, StudentController studentController) {
        this.studentController = studentController;
        headFrame.setTitle(title);
        headFrame.setSize(d);
        headFrame.setLayout(new BorderLayout());
        headFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        headFrame.addWindowListener(new ExitWindowListener());
        tableOfStudents = new TableOfStudents(studentController.getStudentDataBase());
        tableOfStudents.setPreferredSize(d);

    }

    public void initMainFrame() {
        exitMenuItem.addActionListener(new ExitActionListener());
        openMenuItem.addActionListener(new OpenFileListener(studentController, MainFrame.this));
        saveMenuItem.addActionListener(new SaveFileListener(studentController, MainFrame.this));
        addStudentMenuItem.addActionListener(e -> {
            AddStudentDialog addStudentDialog = new AddStudentDialog(studentController, MainFrame.this);
            addStudentDialog.initAddStudentDialog();
        });
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

        openButton.setSize(24, 24);
        addButton.setSize(24, 24);
        saveButton.setSize(24, 24);
        searchButton.setSize(24, 24);
        deleteButton.setSize(24, 24);
        exitButton.setSize(24, 24);
        exitButton.addActionListener(new ExitActionListener());
        openButton.addActionListener(new OpenFileListener(studentController, MainFrame.this));
        saveButton.addActionListener(new SaveFileListener(studentController, MainFrame.this));
        addButton.addActionListener(e -> {
            AddStudentDialog addStudentDialog = new AddStudentDialog(studentController, MainFrame.this);
            addStudentDialog.initAddStudentDialog();
        });
        searchButton.addActionListener(e -> {
            SearchStudentDialog searchStudentDialog = new SearchStudentDialog(studentController, MainFrame.this);
            searchStudentDialog.initSearchStudentDialog();
        });
        deleteButton.addActionListener(e -> {
            DeleteStudentDialog deleteStudentDialog = new DeleteStudentDialog(studentController, MainFrame.this);
            deleteStudentDialog.initDeleteStudentDialog();
        });
        toolBar.add(openButton);
        toolBar.add(saveButton);
        toolBar.add(addButton);
        toolBar.add(searchButton);
        toolBar.add(deleteButton);
        toolBar.add(exitButton);

        headFrame.add(toolBar, BorderLayout.NORTH);
        headFrame.add(tableOfStudents.initTableOfStudents());
        headFrame.setJMenuBar(menuBar);

        headFrame.pack();
        headFrame.setVisible(true);
    }

    public void updateMainFrame() {
        tableOfStudents.reloadTableOfStudent(studentController.getStudentDataBase());
        tableOfStudents.updateUI();
    }

    private void tempAdd() {
        ArrayList<String> tempSurName = new ArrayList<>();
        tempSurName.add("Петров");
        tempSurName.add("Иванов");
        tempSurName.add("Сидоров");
        tempSurName.add("Лукша");
        tempSurName.add("Лукашевич");
        tempSurName.add("Жук");
        tempSurName.add("Касперович");
        tempSurName.add("Лобач");
        tempSurName.add("Кажернович");
        tempSurName.add("Уткин");
        tempSurName.add("Носик");

        ArrayList<String> tempFirstName = new ArrayList<>();
        tempFirstName.add("Петя");
        tempFirstName.add("Иван");
        tempFirstName.add("Егор");
        tempFirstName.add("Максим");
        tempFirstName.add("Саша");
        tempFirstName.add("Коля");
        tempFirstName.add("Настя");
        tempFirstName.add("Карина");
        tempFirstName.add("Илья");
        tempFirstName.add("Василий");
        tempFirstName.add("Виолета");

        ArrayList<String> tempLastName = new ArrayList<>();
        tempLastName.add("Петрович");
        tempLastName.add("Егорыч");
        tempLastName.add("Александрович");
        tempLastName.add("Ильич");
        tempLastName.add("Денисович");
        tempLastName.add("Валентинович");
        tempLastName.add("Валерьевич");
        tempLastName.add("Иванович");
        tempLastName.add("Романович");

        ArrayList<String> tempRegion = new ArrayList<>();
        tempRegion.add("Минск");
        tempRegion.add("Гродно");
        tempRegion.add("Витебск");
        tempRegion.add("Могилёв");
        tempRegion.add("Брест");
        tempRegion.add("Гомель");

        ArrayList<String> tempStreet = new ArrayList<>();
        tempStreet.add("Колоса");
        tempStreet.add("Богданович");
        tempStreet.add("Независимости");
        tempStreet.add("Победы");
        tempStreet.add("Гагарина");
        tempStreet.add("Машиностроителя");
        tempStreet.add("Лобача");
        tempStreet.add("Ракосовского");
        tempStreet.add("Партизанская");

        for (int i = 0; i < 1234; i++) {
            int index = randomGenerator.nextInt(tempRegion.size());
            Student studentTemp = new Student(tempSurName.get(randomGenerator.nextInt(tempSurName.size())),
                    tempFirstName.get(randomGenerator.nextInt(tempFirstName.size())),
                    tempLastName.get(randomGenerator.nextInt(tempLastName.size())), "Беларусь",
                    tempRegion.get(index),
                    tempRegion.get(index),
                    tempStreet.get(randomGenerator.nextInt(tempStreet.size())), randomGenerator.nextInt(20) + 1,
                    randomGenerator.nextInt(5) + 1, randomGenerator.nextInt(20) + 1);
            studentController.addStudent(studentTemp);
        }
    }

}
