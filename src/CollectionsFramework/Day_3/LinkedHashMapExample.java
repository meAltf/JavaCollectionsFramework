package CollectionsFramework.Day_3;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Map<String, String> capitalCities = new LinkedHashMap<>();

        capitalCities.put("India", "Delhi");
        capitalCities.put("USA", "Washington");
        capitalCities.put("UK", "London");

        System.out.println(capitalCities); // Order: India → USA → UK
    }
}
