package ss17.practice.read_and_write_student_list_to_binary_files;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeDataToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String path) {
        List<Student> students = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyen Van A", "Da Nang"));
        students.add(new Student(2, "Nguyen Van S", "Da Lat"));
        students.add(new Student(3, "Nguyen Van C", "Hue"));
        students.add(new Student(4, "Nguyen Van E", "Ha Tinh"));
        students.add(new Student(5, "Nguyen Van F", "Ha Noi"));
        writeDataToFile("E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss17\\practice\\read_and_write_student_list_to_binary_files\\student.txt", students);
        List<Student> studentDataFromFile = readDataFromFile("E:\\Codegym\\C0423G1-TruongVanHueMinh\\module02\\src\\ss17\\practice\\read_and_write_student_list_to_binary_files\\student.txt");
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
