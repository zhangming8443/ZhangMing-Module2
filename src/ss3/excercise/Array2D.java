package ss3.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int n = Integer.parseInt(input.nextLine());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Element in arr1 at index: " + i );
            arr1[i] = Integer.parseInt(input.nextLine());
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Element in arr2 at index: " + i );
            arr2[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        int[] arr = new int[n*2];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length/2){
                arr[i] = arr1[i];
            }
            else {
                arr[i] = arr2[i - arr.length/2];
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
