package view;

import model.StudentDataBase;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;


/**
 * Created by anonymous on 10.04.2017.
 */
public class TableModel extends AbstractTableModel {
    private static final String NUMBER = "№";
    private static final String FULLNAME = "ФИО";
    private static final String FULLADDRESS = "Адресс";
    private ArrayList<TableRow> tableData;

    TableModel() {
        this.tableData = new ArrayList<TableRow>();
    }

    void addStudent(StudentDataBase studentDataBase, int currentPage, int maxNumberOfStudentPerPage) {
        deleteAllStudent();

        int tempBegin = (currentPage - 1) * maxNumberOfStudentPerPage;
        int temp = tempBegin + maxNumberOfStudentPerPage;
        int tempEnd;
        if (studentDataBase.size() == 0 || studentDataBase.size() < temp)
            tempEnd = studentDataBase.size();
        else tempEnd = temp;
        for (int i = tempBegin; i < tempEnd; i++)
            tableData.add(new TableRow(studentDataBase.get(i)));
    }

    void deleteAllStudent() {
        tableData.clear();
    }

    @Override
    public int getRowCount() {
        return tableData.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        TableRow rows = tableData.get(rowIndex);
        return rows.getValue(columnIndex);
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case TableRow.NUMBER_COLUMN:
                return NUMBER;
            case TableRow.FULLNAME_COLUMN:
                return FULLNAME;
            case TableRow.FULLADDDRESS_COLUMN:
                return FULLADDRESS;
        }
        return "";
    }

    public int getSize() {
        return tableData.size();
    }
}
