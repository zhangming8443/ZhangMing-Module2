package practiceAll.algothism_practice;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ss2 {
    public static void main(String[] args) {
        String str = "aabcc";
        String str2 = "adcaa";
        System.out.println(checkString(str, str2));
    }

    public static boolean checkString(String s1, String s2) {
        String[] aStr = s1.split("");
        String[] aStr2 = s2.split("");
        Map<String, Integer> map = new TreeMap<>();
        Map<String, Integer> map2 = new TreeMap<>();
        for (String s : aStr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        System.out.println(map);
        for (String s : aStr2) {
            if (map2.containsKey(s)) {
                map2.put(s, map2.get(s) + 1);
            } else {
                map2.put(s, 1);
            }
        }
        System.out.println(map2);
        int temp = 0;
        for (Map.Entry<String, Integer> entry1 : map.entrySet()) {
            if (entry1.getValue()<=map2.get(entry1.getKey())) {
//            for (Map.Entry<String, Integer> entry2 : map2.entrySet()) {
//                if (entry1.getKey() == entry2.getKey()) {
//                    if (entry1.getValue() < entry2.getValue()) {
//                        temp = entry1.getValue();
//                        System.out.println(entry1.getKey() + " appear " + temp + " time");
//                    } else {
//                        temp = entry2.getValue();
//                        System.out.println(entry1.getKey() + " appear " + temp + " time");
//                    }
//                }
//            }
                System.out.println(entry1.getKey() + " appear " + entry1.getValue() + " time");
            }else {
                System.out.println(entry1.getKey() + " appear " + map2.get(entry1.getKey() + " time"));
            }
        }

        return true;
    }
}
