package practiceAll;

import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
    public static void main(String[] args) {
        //key
        Map<Integer, String> studentMap = new TreeMap<>();
        studentMap.put(1, "Nguyen Van A");
        studentMap.put(2, "Nguyen Van B");
        studentMap.put(3, "Tran Van C");
        for (Integer k : studentMap.keySet()) {
            System.out.println(k + " - " + studentMap.get(k));
        }

        //entry
        for (Map.Entry<Integer, String> stringEntry : studentMap.entrySet()) {
            System.out.println(stringEntry.getKey() + " - " + stringEntry.getValue());
        }
    }
}
