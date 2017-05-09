package view;

import model.StudentDataBase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by anonymous on 10.04.2017.
 */
public class TableOfStudents {

    public int maxNumberOfStudentPerPage = 20;
    private TableModel tableModel = new TableModel();
    private JTable tableOfStudent = new JTable(tableModel);
    private JScrollPane tableScrollPane = new JScrollPane(tableOfStudent);
    private JPanel tablePanel = new JPanel(new BorderLayout());
    private JPanel pagePanel = new JPanel(new BorderLayout());
    private JPanel pageButtonPanel = new JPanel();
    private JPanel pageInfoPanel = new JPanel();
    private JLabel currentNumberOfPageLabel = new JLabel();
    private JLabel maxNumberOfStudentPerPageLabel = new JLabel("*Количесвто записей:");
    private JLabel currentNumberOfStudentPerPageLabel = new JLabel("*Текущее количество записей:");
    private JLabel totalNumberOfStudentLabel = new JLabel("*Общее количество записей:");
    private JLabel numberOfPageLabel = new JLabel("*Количество страниц:");
    private JTextField maxNumberOfStudentPerPageTextField = new JTextField(String.valueOf(maxNumberOfStudentPerPage), 2);
    private JButton nextPageButton = new JButton("Следующая");
    private JButton prevPageButton = new JButton("Предыдущая");
    private JButton firstPageButton = new JButton("Первая");
    private JButton lastPageButton = new JButton("Последняя");
    private int currentPage = 1;
    private int numberOfPage;
    private StudentDataBase studentDataBase = new StudentDataBase();


    TableOfStudents(StudentDataBase studentDataBase) {
        this.studentDataBase = studentDataBase;
        reloadTableOfStudent(studentDataBase);
        nextPageButton.setFont(new Font("", Font.ITALIC, 17));
        prevPageButton.setFont(new Font("", Font.ITALIC, 17));
        firstPageButton.setFont(new Font("", Font.ITALIC, 17));
        lastPageButton.setFont(new Font("", Font.ITALIC, 17));
        currentNumberOfPageLabel.setFont(new Font("", Font.ITALIC, 17));
        maxNumberOfStudentPerPageLabel.setFont(new Font("Max number of student per page", Font.ITALIC, 17));
        maxNumberOfStudentPerPageTextField.setFont(new Font("Max number of student per page", Font.ITALIC, 17));
        currentNumberOfStudentPerPageLabel.setFont(new Font("Current number of student per page", Font.ITALIC, 17));
        totalNumberOfStudentLabel.setFont(new Font("Total number of student", Font.ITALIC, 17));
        numberOfPageLabel.setFont(new Font("Number of Page", Font.ITALIC, 17));
        tableModel.addStudent(this.studentDataBase, currentPage, maxNumberOfStudentPerPage);

    }

    public void reloadTableOfStudent(StudentDataBase studentDataBase) {
        this.studentDataBase = studentDataBase;
        if (this.studentDataBase.size() == 0)
            numberOfPage = 1;
        else numberOfPage = (int) Math.ceil((float) this.studentDataBase.size() / maxNumberOfStudentPerPage);
        if (currentPage > numberOfPage) currentPage = numberOfPage;
        nextPageButton.setEnabled(currentPage != numberOfPage);
        prevPageButton.setEnabled(currentPage != 1);
        firstPageButton.setEnabled(currentPage != 1);
        lastPageButton.setEnabled(currentPage != numberOfPage);
        currentNumberOfPageLabel.setText("---" + String.valueOf(currentPage) + "---");
        tableModel.deleteAllStudent();
        tableModel.addStudent(this.studentDataBase, currentPage, maxNumberOfStudentPerPage);
        currentNumberOfStudentPerPageLabel.setText("*Текущее количество записей: " + String.valueOf(tableModel.getSize()));
        totalNumberOfStudentLabel.setText("*Общее количество записей: " + String.valueOf(this.studentDataBase.size()));
        numberOfPageLabel.setText("*Количество страниц: " + String.valueOf(numberOfPage));
    }


    public JPanel initTableOfStudents() {
        nextPageButton.addActionListener(new NextPageButtonActionListener());
        prevPageButton.addActionListener(new PrevPageButtonActionListener());
        firstPageButton.addActionListener(new FirstPageButtonActionListener());
        lastPageButton.addActionListener(new LastPageButtonActionListener());
        maxNumberOfStudentPerPageTextField.addKeyListener(new MaxNumberKeyListener());
        tableOfStudent.setRowHeight(20);
        tableOfStudent.setFont(new Font("Table Of Student", Font.ITALIC, 17));
        tableOfStudent.getColumnModel().getColumn(0).setPreferredWidth(300);
        tableOfStudent.getColumnModel().getColumn(0).setMaxWidth(300);

        pageButtonPanel.add(firstPageButton);
        pageButtonPanel.add(prevPageButton);
        pageButtonPanel.add(currentNumberOfPageLabel);
        pageButtonPanel.add(nextPageButton);
        pageButtonPanel.add(lastPageButton);
        pageInfoPanel.add(maxNumberOfStudentPerPageLabel);
        pageInfoPanel.add(maxNumberOfStudentPerPageTextField);
        pageInfoPanel.add(currentNumberOfStudentPerPageLabel);
        pageInfoPanel.add(totalNumberOfStudentLabel);
        pageInfoPanel.add(numberOfPageLabel);
        pagePanel.add(pageButtonPanel, BorderLayout.NORTH);
        pagePanel.add(pageInfoPanel, BorderLayout.SOUTH);

        tablePanel.add(tableScrollPane, BorderLayout.NORTH);
        tablePanel.add(pagePanel, BorderLayout.SOUTH);
        return tablePanel;
    }


    public void setPreferredSize(Dimension dimension) {
        tableScrollPane.setPreferredSize(dimension);
    }


    public void updateUI() {
        tableOfStudent.updateUI();
        tableScrollPane.updateUI();
    }

    private class NextPageButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            currentPage++;
            reloadTableOfStudent(studentDataBase);
            updateUI();
        }
    }

    private class PrevPageButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            currentPage--;
            reloadTableOfStudent(studentDataBase);
            updateUI();
        }
    }

    private class FirstPageButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentPage = 1;
            reloadTableOfStudent(studentDataBase);
            updateUI();
        }
    }

    private class LastPageButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            currentPage = numberOfPage;
            reloadTableOfStudent(studentDataBase);
            updateUI();
        }
    }

    private class MaxNumberKeyListener implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                if (Integer.parseInt(maxNumberOfStudentPerPageTextField.getText()) < 1) {
                    JOptionPane.showMessageDialog(tableOfStudent, "Маловато", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    maxNumberOfStudentPerPage = Integer.parseInt(maxNumberOfStudentPerPageTextField.getText());
                    currentPage = 1;
                    reloadTableOfStudent(studentDataBase);
                    updateUI();
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
