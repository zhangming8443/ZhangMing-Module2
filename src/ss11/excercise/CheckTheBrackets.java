package ss11.excercise;

import java.util.Scanner;
import java.util.Stack;

public class CheckTheBrackets {
    //    public static void main(String[] args) {
//        int countOpenBracket = 0;
//        int countCloseBracket = 0;
//        String str = "s * (s – a) * (s – b) * s – c)";
//        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//            char c = str.charAt(i);
//            if (c == '(') {
//                stack.push(c);
//                countOpenBracket++;
//            } else if (c == ')') {
//                stack.push(c);
//                countCloseBracket++;
//            }
//        }
//        if (countOpenBracket == countCloseBracket && stack.get(0) == '(') {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }
//
//    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        String s = " ";
        for (int i = 0; i < str.length(); i++) {
            if (65 < str.charAt(i) && str.charAt(i) < 90){
                s += " " + str.charAt(i);
            }
            else {
                s += str.charAt(i);
            }
        }
        System.out.println(s.trim().toLowerCase());
    }
}
