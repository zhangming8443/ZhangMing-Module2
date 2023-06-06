package ss2.excercise;

import java.util.Scanner;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Display primes numbers less than 100: ");

        byte count = 0;

        for (int i = 2; i < 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
            count = 0;
        }
    }
}
