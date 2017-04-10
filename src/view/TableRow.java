package view;

import model.Address;
import model.Student;

/**
 * Created by anonymous on 10.04.2017.
 */
public class TableRow {
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
    public Object getValue(int index)
    {
        switch (index)
        {
            case 0: return fullName;
            case 1: return country;
            case 2: return region;
            case 3: return city;
            case 4: return street;
            case 5: return house;
            case 6: return housing;
            case 7: return apartment;
        }
        return null;
    }
}
