package view;

import model.Student;
import model.StudentDataBase;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by anonymous on 10.04.2017.
 */
public class TableOfStudents {


    private TableModel tableModel= new TableModel();
    private JTable tableOfStudent = new JTable(tableModel);;
    private JScrollPane tableScrollPane = new JScrollPane(tableOfStudent);

    TableOfStudents(StudentDataBase studentDataBase)
    {
            tableModel.addStudent(studentDataBase);
    }
    public void reloadTableOfStudent(StudentDataBase studentDataBase)
    {
     tableModel.deleteAllStudent();
     tableModel.addStudent(studentDataBase);
    }


    public JScrollPane initTableOfStudents()
    {
        tableOfStudent.setRowHeight(20);
        tableOfStudent.setFont(new Font("Table Of Student", Font.ITALIC, 17));
        tableOfStudent.getColumnModel().getColumn(0).setPreferredWidth(250);


        return tableScrollPane;
    }


    public void setPreferredSize (Dimension dimension)
    {
        tableScrollPane.setPreferredSize(dimension);
    }


    public void updateUI() {
        tableOfStudent.updateUI();
        tableScrollPane.updateUI();
    }

}
