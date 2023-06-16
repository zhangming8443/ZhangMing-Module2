package practice_all.mvc_practice.repository;

import practice_all.mvc_practice.model.Student;

public class StudentRepository implements IStudentRepository {
    static Student[] students = new Student[5];

    static {
        students[0] = new Student(1, "Minh", "21/01/1999", true, "C04");
        students[1] = new Student(1, "Thien", "21/01/1990", true, "C04");
        students[2] = new Student(1, "Sang", "21/01/1992", true, "C04");
    }

    @Override
    public Student[] display() {
        return students;
    }

    @Override
    public void add(Student student) {

    }

    @Override
    public void delete() {

    }
}
