package ss15.excercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        while (true) {
            System.out.println("Enter a: ");
            try {
                a = Double.parseDouble(scanner.nextLine());
                if (a <= 0) {
                    throw new IllegalTriangleException("Enter again please");
                }
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter wrong format !");
            }
        }

        while (true) {
            System.out.println("Enter b: ");
            try {
                b = Double.parseDouble(scanner.nextLine());
                if (b <= 0) {
                    throw new IllegalTriangleException("Enter again please");
                }
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter wrong format !");
            }
        }

        while (true) {
            System.out.println("Enter c: ");
            try {
                c = Double.parseDouble(scanner.nextLine());
                if (c <= 0) {
                    throw new IllegalTriangleException("Enter again please");
                }
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Enter wrong format !");
            }
        }

        try {
            checkTriangle(a, b, c);
            System.out.println("This is Triangle");
        } catch (IllegalTriangleException e) {
            System.out.println("This is not triangle");
        }
    }

    public static boolean checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Day khong phai tam giac");
        } else
            return true;

    }
}
