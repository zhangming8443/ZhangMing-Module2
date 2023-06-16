package practice_all.mvc_practice.service;

import practice_all.mvc_practice.model.Student;
import practice_all.mvc_practice.repository.StudentRepository;

import java.util.Scanner;

public class StudentService implements IStudentService {
    private final StudentRepository studentRepository = new StudentRepository();

    @Override
    public void display() {
        Student[] students = studentRepository.display();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the date: ");
        String date = scanner.nextLine();
        System.out.println("Enter the gender: ");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter the class: ");
        String className = scanner.nextLine();

        Student student = new Student(id, name, date, gender, className);
        studentRepository.add(student);
    }

    @Override
    public void delete() {

    }
}
