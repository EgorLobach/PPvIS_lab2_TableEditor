package view;

import model.Student;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by anonymous on 10.04.2017.
 */
public class TableOfStudents {
    private TableModel tableModel= new TableModel();;
    private JTable tableOfStudent = new JTable(tableModel);;
    private JScrollPane tableScrollPane = new JScrollPane(tableOfStudent);

    TableOfStudents(ArrayList<Student> students)
    {
        for(int i =0; i<students.size();i++)
            tableModel.addStudent(students.get(i));
    }


    public JScrollPane initTableOfStudents()
    {
        tableOfStudent.setRowHeight(20);
        tableOfStudent.setFont(new Font("Table Of Student", Font.ITALIC, 17));

        tempAddData();

        return tableScrollPane;
    }


    public TableModel getTableModel(){return tableModel;}

    public void setPreferredSize (Dimension dimension)
    {
        tableScrollPane.setPreferredSize(dimension);
    }


    private void tempAddData()
    {
        Student student = new Student("Лобач", "Александр", "Валентинович", "Беларусь","Минская область",
                "Минск", "Казинца", 22, 1,64);
        tableModel.addStudent("Лобач", "Егор", "Валентинович", "Беларусь","Минская область",
                "Минск", "Ташкентская", 18, 4,81);
        tableModel.addStudent(student);
    }

}
