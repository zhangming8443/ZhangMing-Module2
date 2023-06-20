package ss11.excercise;

import java.util.*;

public class CountChar {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        String str = "How are you I am fine thank you and you".toLowerCase();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> strEntry : map.entrySet()) {
            System.out.println(strEntry.getKey() + " appear " + strEntry.getValue() + " times ");
        }
    }
}


