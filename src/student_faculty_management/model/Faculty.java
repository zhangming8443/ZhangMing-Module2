package student_faculty_management.model;

import java.util.Objects;

public class Faculty {
    private int id;
    private String name;
    private String date;
    private boolean gender;
    private String proKnowledge;

    public Faculty() {
    }

    public Faculty(int id, String name, String date, boolean gender, String proKnowledge) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.proKnowledge = proKnowledge;
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

    public String getProKnowledge() {
        return proKnowledge;
    }

    public void setProKnowledge(String proKnowledge) {
        this.proKnowledge = proKnowledge;
    }

    @Override
    public String toString() {
        return "Faculty " + "\n ID: " + id + "\n Name:  " + name + "\n Date: " + date + "\n Gender: " + gender + "\n Professional Knowledge: " + proKnowledge + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Faculty faculty = (Faculty) o;
        return id == faculty.id && gender == faculty.gender && Objects.equals(name, faculty.name) && Objects.equals(date, faculty.date) && Objects.equals(proKnowledge, faculty.proKnowledge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date, gender, proKnowledge);
    }

}
