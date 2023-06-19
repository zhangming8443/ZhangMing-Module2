package ss11.excercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ReverseArray<E> {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 8};
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> newStack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.peek();
            stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }


}
