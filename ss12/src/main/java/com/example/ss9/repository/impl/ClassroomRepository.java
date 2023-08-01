package com.example.ss9.repository.impl;

import com.example.ss9.model.Classroom;
import com.example.ss9.repository.IClassroomRepository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClassroomRepository implements IClassroomRepository {
    @Override
    public List<Classroom> getAll() {
        Statement statement = null;
        List<Classroom> classrooms = new ArrayList<>();
        try {
            statement = BaseRepository.getConnectionJavaToDB().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from classrooms");
            while (resultSet.next()) {
               classrooms.add(new Classroom(resultSet.getInt("code_class"),
                       resultSet.getString("name_class")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return classrooms;
    }
}
