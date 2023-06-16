package student_faculty_management.model;

import java.awt.*;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String date;
    private boolean gender;
    private String className;
    private double point;

    public Student() {
    }

    public Student(int id, String name, String date, boolean gender, String className, double point) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.className = className;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student " + "\n ID: " + id + "\n Name:  " + name + "\n Date: " + date + "\n Gender: " + gender + "\n Professional Knowledge: " + className + "\n Point: " + point + "\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && gender == student.gender && Double.compare(student.point, point) == 0 && Objects.equals(name, student.name) && Objects.equals(date, student.date) && Objects.equals(className, student.className);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, gender, className, point);
    }

}
