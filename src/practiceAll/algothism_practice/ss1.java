package practiceAll.algothism_practice;

import java.util.Map;
import java.util.TreeMap;

public class ss1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 4, 5, 2, 1};
        System.out.println(checkMap(arr));
    }

    public static boolean checkMap(int[] arr) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " appear " + entry.getValue() + " time");
        }
        System.out.println(map);
        int count = map.get(arr[4]); // count = 2
        int count1 = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == count) {
                count1++;
            }
        }
        if (count1 == map.size()) {
            return true;
        } else return false;

    }
}

