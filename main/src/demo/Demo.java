package demo;

import javax.crypto.Mac;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
//        Map<Integer, String> map = new HashMap<>();
//        map.put(4, "cde");
//        map.put(1, "abc");
////        System.out.println(map);
//        map.put(2, "bcd");
//        map.put(3, "def");

        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("c", 15);
        map2.put("cfadas", 15);
        map2.put("a", 234567);
        map2.put("b", 9545666);
        map2.put("d", 1233);
        System.out.println(map2);
        System.out.println(map2.containsKey("dfs"));

        ArrayList entry = new ArrayList(map2.entrySet());
        for (int i = 0; i < entry.size(); i++) {
            System.out.println(entry.get(i));
        }
        System.out.println(entry);


    }
}
