package ss11.excercise.reverse_array;

import java.util.*;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String arr = "Able was I ere I saw Elba";
        String str[] = arr.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();

        for (int i = 0; i < str.length; i++) {
            stack.push(str[i]);
            queue.add(str[i]);
        }
        System.out.println(Arrays.toString(str));
        boolean flag = true;
        while (!stack.isEmpty()) {
            if (Objects.equals(stack.pop(), queue.remove())) {
                flag = true;
            } else {
                flag = false;
                System.out.println(false);
                break;
            }
        }
        if (flag) {
            System.out.println(true);
        }
    }

}
