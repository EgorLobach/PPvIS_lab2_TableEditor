package model;

import java.util.ArrayList;

/**
 * Created by anonymous on 11.04.2017.
 */
public class StudentDataBase {
    public  ArrayList<Student> studentArrayList = new ArrayList<>();

    public void add(Student student) {
        studentArrayList.add(student);
    }
}
