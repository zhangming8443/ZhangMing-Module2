package ss4.excercise;

import java.util.Scanner;

public class QuadracticEquation {
    double a, b, c;

    public QuadracticEquation() {
    }

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot() {
        return -b / (2 * a);
    }

    public String getSolution() {
        if (getDiscriminant() > 0) {
            return "The equation has 2 roots: x1 = " + getRoot1() + " & x2 = " + getRoot2();
        } else if (getDiscriminant() == 0) {
            return "The equation has 1 root: x = " + getRoot();
        } else
            return "The equation has no root !";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = Double.parseDouble(input.nextLine());
        System.out.println("Enter b: ");
        double b = Double.parseDouble(input.nextLine());
        System.out.println("Enter c:");
        double c = Double.parseDouble(input.nextLine());
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        QuadracticEquation quadracticEquation = new QuadracticEquation(a, b, c);
        System.out.println(quadracticEquation.getSolution());
    }
}
