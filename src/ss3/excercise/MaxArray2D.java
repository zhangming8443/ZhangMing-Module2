package ss3.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxArray2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the rows");
        int m = Integer.parseInt(input.nextLine());
        System.out.println("Enter the cols");
        int n = Integer.parseInt(input.nextLine());
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the element " + "[" + i + "][" + j + "]");
                int element = Integer.parseInt(input.nextLine());
                arr[i][j] = element;
            }

        }
        System.out.println("The 2D Array is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));

        int max = arr[0][0];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("MAX = " + max);
    }
}
