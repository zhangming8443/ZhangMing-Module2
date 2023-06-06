package ss2.excercise;

import java.util.Scanner;

public class DisplayTheFirstPrimes {
    public static void main(String[] args) {
        int numbers;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amout the first primes: ");
        numbers = input.nextInt();
        byte countSNT = 0;
        byte count = 0;
        for (int i = 2; i < 1000; i++) {
            if (countSNT < numbers) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i);
                    countSNT++;
                }
                count = 0;
            } else {
                break;
            }
        }
    }
}
