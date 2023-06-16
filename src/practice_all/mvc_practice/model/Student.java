package practice_all.mvc_practice.model;

public class Student {
    private int id;
    private String name;
    private String date;
    private boolean gender;
    private String className;

    public Student() {
    }

    public Student(int id, String name, String date, boolean gender, String className) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.gender = gender;
        this.className = className;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", gender=" + gender +
                ", className='" + className + '\'' +
                '}';
    }
}
