package ss3.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersInASpecifiedColumn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = Integer.parseInt(input.nextLine());
        System.out.println("Enter the cols: ");
        int cols = Integer.parseInt(input.nextLine());
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Enter the element at [" + i + "][" + j + "]");
                int element = Integer.parseInt(input.nextLine());
                arr[i][j] = element;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int choice;

        do {
            System.out.println("Enter the column you want to sum: ");
            choice = Integer.parseInt(input.nextLine());
            if (!(choice >= 0 && choice < arr.length )) {
                System.out.println("The col should at between 0 -> " + (arr.length - 1));
            }
        }
        while (!(choice >= 0 && choice < arr.length));

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += arr[i][choice];
        }
        System.out.println("Sum = at col " + choice + " = " + sum);
    }

}

