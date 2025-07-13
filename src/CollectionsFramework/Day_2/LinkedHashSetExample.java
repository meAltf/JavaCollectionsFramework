package CollectionsFramework.Day_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");

        System.out.println(cities); // Output in insertion order
    }
}
