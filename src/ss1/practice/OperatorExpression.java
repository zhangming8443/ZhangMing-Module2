package ss1.practice;

import java.util.Scanner;

public class OperatorExpression {
    public static void main(String[] args) {
        float width, height;
        Scanner scanner = new Scanner(System.in); //khai bao doi tuong sccanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // nhap chieu rong

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); // nhap chieu dai

        float area = width * height;
        System.out.println("Area is: " + area);

    }
}