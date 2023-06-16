package practice_all.mvc_practice.controller;

import practice_all.mvc_practice.service.IStudentService;
import practice_all.mvc_practice.service.StudentService;

import javax.swing.text.Style;
import java.util.Scanner;

public class StudentController {
    private static StudentService studentService = new StudentService();

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Choice function: "
                    + "\n1. Display"
                    + "\n2. Add"
                    + "\n3. Delete"
                    + "\n4. Edit"
                    + "\n5. Search"
                    + "\n6. Exit"
            );
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("---Student List Display ");
                    studentService.display();
                    break;
                case 2:
                    System.out.println("---Add Student---");
                    studentService.add();
                case 3:
                    System.out.println("---Delete Student---");
                    studentService.delete();
            }

        }
        while (flag);
    }
}
