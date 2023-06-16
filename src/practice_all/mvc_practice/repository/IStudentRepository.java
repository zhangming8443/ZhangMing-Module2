package practice_all.mvc_practice.repository;

import practice_all.mvc_practice.model.Student;

public interface IStudentRepository {
    Student[] display();

    void add(Student student);

    void delete();
}
