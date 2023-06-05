package ss1.exercise;

import java.util.Scanner;

public class ConvertNumberToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number;
        float dozens;
        int temp;
        float temp2;
        int temp3;
        String str = "";
        String str2 = "";
        System.out.println("Enter a number between 0 and 999: ");
        number = scanner.nextInt();
        String[] arr = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirhteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen", "nineteen"};
        String[] arr2 = {"twenty", "thirthty", "fourty", "fifty", "sixty", "seventy", "eightty", "ninety"};
        String arr3 = "hundreds";
        dozens = number / 10;
        temp = (int) dozens;
        temp2 =((dozens - temp)*10);
        temp3 = Math.round(temp2);

        System.out.println(dozens);
        System.out.println(temp);
        System.out.println(temp2);
        System.out.println(temp3);

        if (number % 10 == 0 && number > 0) {
            for (int i = 0; i < arr2.length; i++) {
                if ((temp - 2) == i) {
                    str = arr2[i];
                }
            }
        } else if (number <= 20) {
            for (int i = 0; i < arr.length; i++) {
                if (number == i) {
                    str = arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr2.length ; i++) {
                if ((temp - 2) == i){
                    str = arr2[i];
                    for (int j = 0; j < arr.length; j++) {
                        if (temp3 == j){
                            str2 = arr[j];
                        }

                    }
                }

            }
        }

        System.out.print(str + " ");
        System.out.print(str2);

    }
}
