package ss11.excercise;

import java.util.Stack;

public class CheckTheBrackets {
    public static void main(String[] args) {
        int countOpenBracket = 0;
        int countCloseBracket = 0;
        String str = "s * (s – a) * (s – b) * s – c)";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                stack.push(c);
                countOpenBracket++;
            } else if (c == ')') {
                stack.push(c);
                countCloseBracket++;
            }
        }
        if (countOpenBracket == countCloseBracket && stack.get(0) == '(') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
