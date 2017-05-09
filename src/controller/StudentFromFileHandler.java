package controller;

import model.Student;
import model.StudentDataBase;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * Created by anonymous on 25.04.2017.
 */
public class StudentFromFileHandler extends DefaultHandler {
    private StudentDataBase studentDataBase = new StudentDataBase();
    private Student student;
    private StudentController studentController;

    StudentFromFileHandler(StudentController studentController) {
        student = null;
        this.studentController = studentController;
    }

    StudentDataBase getStudentDataBase() {
        return studentDataBase;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {
        if (qName.equalsIgnoreCase(XMLConst.STUDENT)) {
            String surName = attributes.getValue(XMLConst.SURNAME);
            String firstName = attributes.getValue(XMLConst.FIRSTNAME);
            String lastName = attributes.getValue(XMLConst.SECONDNAME);
            String country = attributes.getValue(XMLConst.COUNTRY);
            String region = attributes.getValue(XMLConst.REGION);
            String city = attributes.getValue(XMLConst.CITY);
            String street = attributes.getValue(XMLConst.STREET);
            int house = Integer.valueOf(attributes.getValue(XMLConst.HOUSE));
            int housing = Integer.valueOf(attributes.getValue(XMLConst.HOUSING));
            int apartment = Integer.valueOf(attributes.getValue(XMLConst.APARTMENT));
            student = new Student(surName, firstName, lastName, country, region, city, street, house, housing, apartment);
            studentDataBase.add(student);
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

    }
}