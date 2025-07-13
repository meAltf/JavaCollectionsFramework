package CollectionsFramework.Day_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate

        System.out.println(fruits); // Unordered, no duplicates
    }
}
