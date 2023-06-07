package ss3.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumbersDiagonally {
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

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("SUM = " + sum);
    }
}
