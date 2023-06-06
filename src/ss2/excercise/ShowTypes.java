package ss2.excercise;

import java.util.Scanner;

public class ShowTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Pirnt isosceles triangle");
        System.out.println("0. Exit");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                for (int i = 0; i < 3; i++) {
                    System.out.println(" ");
                    for (int j = 0; j < 10; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                for (int i = 0; i < 5; i++) {
                    System.out.println(" ");
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for (int i = 5; i >= 1; i--) {
                    System.out.println(" ");
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice !");
        }
    }
}
