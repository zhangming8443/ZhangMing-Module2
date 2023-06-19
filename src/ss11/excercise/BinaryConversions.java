package ss11.excercise;

import java.util.Scanner;
import java.util.Stack;

public class BinaryConversions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = Integer.parseInt(input.nextLine());

        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        System.out.println(stack);

        int size = stack.size();
        Stack<Integer> newStack = new Stack<>();
        for (int i = 0; i < size  ; i++) {
            newStack.push(stack.pop());
        }
        System.out.println(newStack);
    }
}
