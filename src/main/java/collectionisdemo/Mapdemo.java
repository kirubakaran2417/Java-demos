package collectionisdemo;

import java.util.HashMap;
import java.util.Map;

public class Mapdemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"sri");
        map.put(4,"kiruba");
        map.put(6,"anna");
        map.put(8,"vignesh");
        System.out.println(map);
        System.out.println(map.get(8));
        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.size());

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
