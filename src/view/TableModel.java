package view;

import model.Student;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by anonymous on 10.04.2017.
 */
public class TableModel extends AbstractTableModel {
    private int columnCount = 8;
    private List<Student> tableData;
    String colNames[] = {"ФИО", "Страна", "Область", "Город", "Улица", "Дом", "Корпус", "Квартира"};

    TableModel()
    {
        tableData = new ArrayList<Student>();
    }

    public void addStudent(String surName,String firstName,String lastName, String country, String region,
                           String city, String street, int house, int housing, int apartment)
    {
        tableData.add(new Student(surName, firstName, lastName, country, region, city, street, house, housing, apartment));
    }
    public void addStudent(Student student)
    {
        tableData.add(student);
    }

    @Override
    public int getRowCount() {
        return tableData.size();
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student rows = tableData.get(rowIndex);
        return rows.getValue(columnIndex);
    }
    @Override
    public String getColumnName(int columnIndex)
    {
        switch (columnIndex)
        {
            case 0: return "ФИО";
            case 1: return "Страна";
            case 2: return "Область";
            case 3: return "Город";
            case 4: return "Улица";
            case 5: return "Дом";
            case 6: return "Корпус";
            case 7: return "Квартира";
        }
        return "";
    }
}
