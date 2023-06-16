package student_faculty_management.repository;

import student_faculty_management.model.Faculty;

import java.util.ArrayList;

public class FacultyRepository {
    static public ArrayList<Faculty> facultiesArrayList = new ArrayList<>();

    static {
        facultiesArrayList.add(new Faculty(1, "Tran Van A", "20/03/1999", true, "Hoa hoc"));
        facultiesArrayList.add(new Faculty(2, "Tran Van B", "20/03/1999", true, "Tieng anh"));
        facultiesArrayList.add(new Faculty(3, "Nguyen Thi D", "20/03/1999", false, "Toan hoc"));
    }

    public ArrayList<Faculty> display() {
        return facultiesArrayList;
    }
}
