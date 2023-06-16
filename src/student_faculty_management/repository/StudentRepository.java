package student_faculty_management.repository;

import student_faculty_management.model.Student;

import java.util.ArrayList;

public class StudentRepository {
    static public ArrayList<Student> studentsArrayList = new ArrayList<>();

    static {
        studentsArrayList.add(new Student(1, "Nguyen Hoang F", "01/01/1999", true, "C04", 10));
        studentsArrayList.add(new Student(2, "Hoang Van T", "19/03/1932", true, "C23", 10));
        studentsArrayList.add(new Student(3, "Tran Bao T", "19/03/1932", false, "A21", 9));
    }


    public ArrayList<Student> display() {
        return studentsArrayList;
    }

}
