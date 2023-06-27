package ss19.practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        String regexEmail = "^[a-z]\\w{5,}@[a-z]{3,5}\\.[a-z]{2,5}$";
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(Pattern.matches(regexEmail, input));
    }

}
