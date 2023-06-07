package ss3.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class CountString {
    public static int count(String str, char c) {
        int res = 0; // bien dem
        for (int i = 0; i < str.length(); i++) { //duyet chuoi
            if (str.charAt(i) == c) { //khi ki tu thu i = c
                res++; // res + 1
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        String str = "no pain no gain";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = input.nextLine();
//        char c = 'n';
        System.out.println("Enter a character to find: ");
        char c = input.nextLine().charAt(0);
        System.out.println(count(str, c));
    }
}
