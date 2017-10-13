package model;

import java.util.ArrayList;

/**
 * Created by anonymous on 10.04.2017.
 */
public class Student {

    private int number;
    private String surName;  //фамилия
    private String firstName;//имя
    private String secondName; //отчесвто
    private Address address;


    public Student(String surName, String firstName, String secondName,
                   String country, String region, String city, String street,
                   int house, int housing, int apartment) {
        this.surName = surName;
        this.firstName = firstName;
        this.secondName = secondName;
        this.address = new Address(country, region, city, street, house, housing, apartment);
    }

    public Student() {

    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getSurName() {
        return surName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Address getAddress() {
        return address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Object getValue(int index) {
        switch (index) {
            case 0:
                return surName;
            case 1:
                return firstName;
            case 2:
                return secondName;
            case 3:
                return address;
        }
        return null;
    }
}
