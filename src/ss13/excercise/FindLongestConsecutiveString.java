package ss13.excercise;

import java.util.LinkedList;
import java.util.Scanner;

public class FindLongestConsecutiveString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (list.size() > 1 && str.charAt(i) <= list.getLast() && list.contains(str.charAt(i))) {
                list.clear();
            }
            list.add(str.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character c : max) {
            System.out.print(c);
        }

    }
}
