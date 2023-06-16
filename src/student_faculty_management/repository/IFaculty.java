package student_faculty_management.repository;

import student_faculty_management.model.Faculty;

import java.util.ArrayList;

public interface IFaculty {
    ArrayList<Faculty> display();

    void add(Faculty faculty);

    void delete(Faculty faculty);
}
