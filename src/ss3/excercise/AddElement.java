package ss3.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr;
        int n;

        do {
            System.out.println("Enter the array lenght: ");
            n = Integer.parseInt(input.nextLine());
        }
        while (n <= 0);
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element " + (i + 1) + " : ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.print("Array: " + Arrays.toString(arr));

        int[] newArr = new int[n + 1];
        int index;
        int elementNew;
        int choice;

        do {
            System.out.println("\n" + "Enter the element to add: ");
            elementNew = Integer.parseInt(input.nextLine()); //phan tu can them
            System.out.println("Enter the index to add: ");
            index = Integer.parseInt(input.nextLine()); // o vi tri nao trong mang
            System.out.println("Do you want to add element " + elementNew + " at index: " + (index - 1)); // ban co muon xoa khong
            System.out.println("1. Yes");
            System.out.println("2. No");
            choice = Integer.parseInt(input.nextLine()); //confirm 1 or 2
            switch (choice) {
                case 1:
                    for (int i = 0; i < n + 1; i++) { // n + 1 do dai mang moi. Nhap 10 vi tri 2. nhap mang {1,2,3,4,5,6} => {1,2,10,3,4,5,6}
                        if (i < index) { // khi i nho hon index => 0 < 2 => 0 < 2 => i = 0,1
                            newArr[i] = arr[i]; // => newArr = {1,2,x,x,x,x,x}
                        } else if (i == index) { // khi 2 = 2
                            newArr[i] = elementNew; // newArr[2] = 10 => {
                        } else {
                            newArr[i] = arr[i - 1]; //nguoc lai i > index (2) => 3 > 2 => newArr[2] = arr[3-1] (value = 3),... 4,5,6}
                        }
                    }
                    System.out.println(Arrays.toString(newArr)); //newArr = {1,2,10,3,4,5,6}
                case 2:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }
}
