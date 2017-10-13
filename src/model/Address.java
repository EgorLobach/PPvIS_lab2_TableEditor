package model;

/**
 * Created by anonymous on 10.04.2017.
 */
public class Address {
    private String country;  //страна
    private String region;   //область
    private String city;     //город
    private String street;   //улица
    private int house;       //дом
    private int housing;     //корпус
    private int apartment;   //квартира

    Address(String country, String region, String city, String street, int house, int housing, int apartment) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.housing = housing;
        this.apartment = apartment;
    }

    public Address(Address address) {
        this.country = address.getCountry();
        this.region = address.getRegion();
        this.city = address.getCity();
        this.street = address.getStreet();
        this.house = address.getHouse();
        this.housing = address.getHousing();
        this.apartment = address.getApartment();
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setHousing(int housing) {
        this.housing = housing;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public int getApartment() {
        return apartment;
    }

    public int getHouse() {
        return house;
    }

    public int getHousing() {
        return housing;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getStreet() {
        return street;
    }

    public Object getValue(int index) {
        switch (index) {
            case 0:
                return country;
            case 1:
                return region;
            case 2:
                return city;
            case 3:
                return street;
            case 4:
                return house;
            case 5:
                return housing;
            case 6:
                return apartment;
        }
        return null;
    }
}
