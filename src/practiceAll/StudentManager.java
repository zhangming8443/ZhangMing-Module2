package practiceAll;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {
    static Student[] students = new Student[4];

    static {
        students[0] = new Student(1, "Minh", true, "C02");
        students[1] = new Student(2, "Hai", true, "C11");
        students[2] = new Student(3, "Sang", true, "A04");
        students[3] = new Student(4, "Thien", true, "G23");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Function: " +
                    "\n1. Display" +
                    "\n2. Add" +
                    "\n3. Delete" +
                    "\n4. Edit" +
                    "\n5. Search" +
                    "\n6. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    display();
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.exit(0);
            }
        }
        while (true);
    }

    public static void display() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

