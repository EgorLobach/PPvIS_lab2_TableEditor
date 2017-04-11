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
    private ArrayList<Student> studentArrayList;
    private int countPage = 20;
    private int currentPage = 1;

    private TableModel tableModel= new TableModel();
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
        tableOfStudent.getColumnModel().getColumn(0).setPreferredWidth(250);

        /*
        tempAddData();

        Student.studentArrayList.add(new Student("Лобач", "Александр", "Валентинович", "Беларусь","Минская область",
               "Минск", "Казинца", 22, 1,64));
        updateTable();
        */

        return tableScrollPane;
    }


    public TableModel getTableModel(){return tableModel;}

    public void setPreferredSize (Dimension dimension)
    {
        tableScrollPane.setPreferredSize(dimension);
    }


/*
    public void updateTable(){
        tableOfStudent.removeAll();
        tableOfStudent.updateUI();
        tableModel.deleteAllStudent();
        tableModel.addStudent(Student.studentArrayList);
        tableOfStudent.revalidate();
        tableOfStudent.repaint();
    }
*/
}
