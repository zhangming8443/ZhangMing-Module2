package ss13.excercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SortByAscii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to sort ASCII: ");
        String str = scanner.nextLine();
        LinkedList<Character> maxString = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > maxString.size()) {
                maxString.clear();
                maxString.addAll(list);
            }
            list.clear();
        }
        for (Character c : maxString) {
            System.out.print(c);
        }
    }
}
