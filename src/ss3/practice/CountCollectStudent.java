package ss3.practice;

import java.util.Scanner;

public class CountCollectStudent {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = Integer.parseInt(input.nextLine());
            if (size > 10) {
                System.out.println("Size should not exceed 10");
            }
        }
        while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter a mark for student " + (i + 1) + " : ");
            array[i] = Integer.parseInt(input.nextLine());
            i++;
        }
        int count = 0;
        System.out.println("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.println("The number of a students passing the exam is " + count);
    }
}
