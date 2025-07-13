package CollectionsFramework.Day_3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Apple", 2);
        map.put("Banana", 5);
        map.put("Orange", 3);

        System.out.println(map); // Order not guaranteed

        System.out.println("Banana count: " + map.get("Banana"));
    }
}
