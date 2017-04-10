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
    private int countStudOnPage = 20;
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

        tempAddData();

        /*
        studentArrayList.add(new Student("Лобач", "Александр", "Валентинович", "Беларусь","Минская область",
               "Минск", "Казинца", 22, 1,64));
        updateTable();
        */

        return tableScrollPane;
    }
    public void makeTable(ArrayList<Student> studentArrayList)
    {
        for(int i = 0; i < studentArrayList.size(); i++){
            tableOfStudent.setValueAt(studentArrayList.get(i).getSurName() +
                    " " + studentArrayList.get(i).getFirstName() +
                    " " + studentArrayList.get(i).getSecondName(),i,0);
            tableOfStudent.setValueAt(studentArrayList.get(i).getAddress().getCountry(),i,1);
            tableOfStudent.setValueAt(studentArrayList.get(i).getAddress().getRegion(),i,2);
            tableOfStudent.setValueAt(studentArrayList.get(i).getAddress().getCity(),i,3);
            tableOfStudent.setValueAt(studentArrayList.get(i).getAddress().getStreet(),i,4);
            tableOfStudent.setValueAt(studentArrayList.get(i).getAddress().getHouse(),i,5);
            tableOfStudent.setValueAt(studentArrayList.get(i).getAddress().getHousing(),i,6);
            tableOfStudent.setValueAt(studentArrayList.get(i).getAddress().getApartment(),i,7);
        }

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

    public void updateTable(){
        tableOfStudent.removeAll();
        tableOfStudent.updateUI();
        makeTable(studentArrayList);
        tableOfStudent.revalidate();
        tableOfStudent.repaint();
    }
}
