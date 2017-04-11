package controller;

import model.Student;
import model.StudentDataBase;

/**
 * Created by anonymous on 11.04.2017.
 */
public class StudentController {
    private StudentDataBase studentDataBase;

    public StudentController(StudentDataBase studentDataBase)
    {

        this.studentDataBase = studentDataBase;
    }

    public void addStudent(Student student) {
        studentDataBase.add(student);
    }
}
