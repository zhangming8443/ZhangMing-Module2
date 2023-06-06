package ss3.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {

        int n;
        int[] arr;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter the array length: ");
            n = Integer.parseInt(input.nextLine());
        }
        while (n <= 0);
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element: " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Array: " + Arrays.toString(arr));

        int x;
        boolean check = false;
        System.out.println("Enter element to delete: ");
        x = Integer.parseInt(input.nextLine());

        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                check = true;
                x = arr[i];
                break;
            }
        }
        if (check) {
            System.out.println(x);
        } else {
            System.out.println("element doesn't exist");
        }

        int[] arrNew;
        arrNew = new int[n];
        int indexDel = 0;

        for (int i = 0; i < arr.length; i++) {
            if (x != arr[i]){
                arrNew[indexDel] = arr[i];
                indexDel++;
            }
        }
        System.out.print("New Array: " + Arrays.toString(arrNew));
    }
}
