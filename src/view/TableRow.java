package view;

import model.Address;
import model.Student;

/**
 * Created by anonymous on 10.04.2017.
 */
class TableRow {
    static final int NUMBER_COLUMN = 0;
    static final int FULLNAME_COLUMN = 1;

    static final int FULLADDDRESS_COLUMN = 2;

    private int number;
    private String fullName;
    private String fullAddress;

    TableRow(Student student) {
        this.number = student.getNumber();
        this.fullName = student.getSurName() + " " + student.getFirstName() + " " + student.getSecondName();
        Address address = student.getAddress();
        this.fullAddress = address.getCountry()+", обл."+address.getRegion()+", г."+address.getCity()+", ул."+
                address.getStreet()+", д."+address.getHouse()+", кор."+address.getHousing()+", кв."+address.getApartment();
    }

    Object getValue(int columnIndex) {

        switch (columnIndex) {
            case NUMBER_COLUMN:
                return number;
            case FULLNAME_COLUMN:
                return fullName;
            case FULLADDDRESS_COLUMN:
                return fullAddress;
        }
        return null;
    }
}
