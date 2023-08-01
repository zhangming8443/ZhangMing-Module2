package com.example.ss9.repository.impl;

import com.example.ss9.dto.StudentListDto;
import com.example.ss9.model.Student;
import com.example.ss9.repository.IStudentRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Haitt", 9.0, "22324", 1));
        students.add(new Student(2, "TrungDP", 8.0, "22324", 1));
        students.add(new Student(3, "TrungDC", 8.0, "22324", 2));
        students.add(new Student(4, "TienNVT", 9.0, "22324", 3));
        students.add(new Student(5, "ChanhTV", 9.0, "22324", 4));
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try {
            Statement statement = BaseRepository.getConnectionJavaToDB().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");
            Student student;
            while (resultSet.next()) {
                student = new Student();
                student.setCode(resultSet.getInt("code_student"));
                student.setNameStudent(resultSet.getString("name_student"));
                student.setPoint(resultSet.getDouble("point_student"));
                student.setIdCard(resultSet.getString("id_card"));
                student.setCodeClass(resultSet.getInt("code_class"));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    @Override
    public void addStudent(Student student) {
        try {
            PreparedStatement statement = BaseRepository.getConnectionJavaToDB()
                    .prepareStatement("insert into students(name_student, point_student, id_card, code_class) values (?,?,?,?)");
            statement.setString(1, student.getNameStudent());
            statement.setDouble(2, student.getPoint());
            statement.setString(3, student.getIdCard());
            statement.setInt(4, student.getCodeClass());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void deleteByCode(int codeStudent) {
        try {
            PreparedStatement statement = BaseRepository.getConnectionJavaToDB()
                    .prepareStatement("delete from students where code_student = ?");
            statement.setInt(1, codeStudent);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<StudentListDto> getAllDto() {
        List<StudentListDto> students = new ArrayList<>();
        try {
            Statement statement = BaseRepository.getConnectionJavaToDB().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students join classrooms on students.code_class = classrooms.code_class");
            StudentListDto student;
            while (resultSet.next()) {
                student = new StudentListDto();
                student.setCode(resultSet.getInt("code_student"));
                student.setNameStudent(resultSet.getString("name_student"));
                student.setPoint(resultSet.getDouble("point_student"));
                student.setIdCard(resultSet.getString("id_card"));
                student.setNameClass(resultSet.getString("name_class"));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }


}
