package student_faculty_management.view;

import student_faculty_management.model.Student;
import student_faculty_management.repository.StudentRepository;

public class StudentView {
    public static void main(String[] args) {
        StudentRepository student = new StudentRepository();
        System.out.println(student.display());
    }
}
