package student_faculty_management.repository;

import student_faculty_management.model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public interface IStudentRepository {
    ArrayList<Student> display();

    void add(Student student);

    void delete(Student student);
}
