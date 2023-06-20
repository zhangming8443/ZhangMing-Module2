package ss13.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchByRecursion {

    static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {
            int middle = (left + right) / 2;
            if (value < arr[middle]) {
                right = middle - 1;
            } else if (arr[middle] == value) {
                return middle;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size array: ");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the element at index " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After sort: " + Arrays.toString(arr));
        System.out.println("Enter a number to search: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("number " + number + " at index " + binarySearch(arr, number));
    }
}
