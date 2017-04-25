package view;

import model.Address;
import model.Student;

/**
 * Created by anonymous on 10.04.2017.
 */
public class TableRow {
    public static final int FULLNAME_COLUMN = 0;
    public static final int COUNTRY_COLUMN = 1;
    public static final int REGION_COLUMN = 2;
    public static final int CITY_COLUMN = 3;
    public static final int STREET_COLUMN = 4;
    public static final int HOUSE_COLUMN = 5;
    public static final int HOUSING_COLUMN = 6;
    public static final int APARTMENT_COLUMN = 7;
    String fullName;
    private String country;  //страна
    private String region;   //область
    private String city;     //город
    private String street;   //улица
    private int house;       //дом
    private int housing;     //корпус
    private int apartment;   //квартира

    public TableRow(Student student)
    {
        this.fullName = student.getSurName()+" "+student.getFirstName()+" "+student.getSecondName();
        Address address = student.getAddress();
        this.country=address.getCountry();
        this.region=address.getRegion();
        this.city=address.getCity();
        this.street=address.getStreet();
        this.house=address.getHouse();
        this.housing=address.getHousing();
        this.apartment=address.getApartment();
    }
    public Object getValue(int columnIndex)
    {

        switch (columnIndex)
        {
            case FULLNAME_COLUMN: return fullName;
            case COUNTRY_COLUMN: return country;
            case REGION_COLUMN: return region;
            case CITY_COLUMN: return city;
            case STREET_COLUMN: return street;
            case HOUSE_COLUMN: return house;
            case HOUSING_COLUMN: return housing;
            case APARTMENT_COLUMN: return apartment;
        }
        return null;
    }
}
