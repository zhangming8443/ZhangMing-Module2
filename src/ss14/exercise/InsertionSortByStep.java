package ss14.exercise;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Ener " + list.length + " values: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
        System.out.println("List after sort:  ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }

    public static void insertionSortByStep(int[] list) {
        int index;
        int temp;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            index = i;
            while (index > 0 && temp < list[index - 1]) {
                System.out.println("Swap " + list[index] + " with " + list[index - 1]);
                list[index] = list[index - 1];
                index--;
            }
            list[index] = temp;
        }
    }
}
