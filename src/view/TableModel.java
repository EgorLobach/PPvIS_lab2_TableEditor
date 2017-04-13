package view;

import model.StudentDataBase;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

/**
 * Created by anonymous on 10.04.2017.
 */
public class TableModel extends AbstractTableModel {
    private int columnCount = 8;
    private ArrayList<TableRow> tableData;

    TableModel()
    {
        this.tableData = new ArrayList<TableRow>();
    }

    public void addStudent(StudentDataBase studentDataBase, int currentPage, int maxNumberOfStudentPerPage)
    {
        deleteAllStudent();

        int tempBegin = (currentPage-1)*maxNumberOfStudentPerPage;
        int temp= tempBegin+maxNumberOfStudentPerPage;
        int tempEnd;
        if (studentDataBase.size()==0||studentDataBase.size()<temp)
            tempEnd=studentDataBase.size();
        else tempEnd=temp;
        for (int i=tempBegin; i<tempEnd;i++)
            tableData.add(new TableRow(studentDataBase.get(i)));
    }
    public void deleteAllStudent()
    {
        tableData.clear();
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
        TableRow rows = tableData.get(rowIndex);
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
    public int getSize()
    {
        return tableData.size();
    }
}
