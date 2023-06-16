package student_faculty_management.view;

import student_faculty_management.repository.FacultyRepository;

public class FacultyView {
    public static void main(String[] args) {
        FacultyRepository facultyShow = new FacultyRepository();
        System.out.println(facultyShow.display());
    }
}
