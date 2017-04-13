package controller;

import model.Student;
import model.StudentDataBase;

/**
 * Created by anonymous on 11.04.2017.
 */
public class StudentController {
    private StudentDataBase studentDataBase;
    public StudentDataBase getStudentDataBase()
    {
        return studentDataBase;
    }

    public StudentController(StudentDataBase studentDataBase)
    {
        this.studentDataBase = studentDataBase;
    }

    public void addStudent(Student student) {
        studentDataBase.add(student);
    }

    public int deleteByHouseNumberAndLastName(String surname1, int house) {
        int count = 0;
        for (int i =0; i<studentDataBase.size();i++)
        {
            if (studentDataBase.get(i).getSurName().equals(surname1)&&studentDataBase.get(i).getAddress().getHouse()==house)
            {studentDataBase.delete(i);
                count++;}
        }
        return count;
    }

    public int deleteByStreetAndApartment(String street, int apartment) {
        int count = 0;
        for (int i =0; i<studentDataBase.size();i++)
        {
            if (studentDataBase.get(i).getAddress().getStreet().equals(street)&&studentDataBase.get(i).getAddress().getApartment()==apartment)
            {studentDataBase.delete(i);
                count++;}
        }
        return count;
    }

    public int deleteByNameAndNumbersFoundInTheRoomNumber(String surname2, int numberInHouse) {//доделать по цифрам встречающимся в номере дома
        int count = 0;
        for (int i =0; i<studentDataBase.size();i++)
        {
            if (studentDataBase.get(i).getSurName().equals(surname2)&&studentDataBase.get(i).getAddress().getHouse()==numberInHouse)
            {studentDataBase.delete(i);
                count++;}
        }
        return count;
    }

    public StudentDataBase searchByHouseNumberAndLastName(String surname1, int house) {
        StudentDataBase tempStudentDataBase = new StudentDataBase();

        for (int i =0; i<studentDataBase.size();i++)
        {
            if (studentDataBase.get(i).getSurName().equals(surname1)&&studentDataBase.get(i).getAddress().getHouse()==house)
            tempStudentDataBase.add(studentDataBase.get(i));
        }

        return tempStudentDataBase;
    }

    public StudentDataBase searchByStreetAndApartment(String street, int apartment) {
        StudentDataBase tempStudentDataBase = new StudentDataBase();

        for (int i =0; i<studentDataBase.size();i++)
        {
            if (studentDataBase.get(i).getAddress().getStreet().equals(street)&&studentDataBase.get(i).getAddress().getApartment()==apartment)
                tempStudentDataBase.add(studentDataBase.get(i));
        }

        return tempStudentDataBase;
    }

    public StudentDataBase searchByNameAndNumbersFoundInTheRoomNumber(String surname2, int numberInHouse) {//доделать по цифрам встречающимся в номере дома
        StudentDataBase tempStudentDataBase = new StudentDataBase();
        for (int i =0; i<studentDataBase.size();i++)
        {
            if (studentDataBase.get(i).getSurName().equals(surname2)&&studentDataBase.get(i).getAddress().getHouse()==numberInHouse)
                tempStudentDataBase.add(studentDataBase.get(i));
        }
        return tempStudentDataBase;
    }
}
