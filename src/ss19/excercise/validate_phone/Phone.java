package ss19.excercise.validate_phone;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    public static void main(String[] args) {
        String phoneRegex = "^84-(0\\d{9})$";
        String[] phoneList = {"a8-22222222", "84-0978489648", "84-22b22222", "84-9978489648"};
        for (String s : phoneList) {
            System.out.println(s.matches(phoneRegex));
        }
    }
}
