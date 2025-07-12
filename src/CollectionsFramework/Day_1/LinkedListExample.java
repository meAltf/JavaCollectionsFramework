package CollectionsFramework.Day_1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        List<String> cities = new LinkedList<>();

        cities.add("Chennai");
        cities.add("Bangalore");
        cities.add(1, "Kerala");

        System.out.println(cities);

        cities.remove(0);
        System.out.println(cities);
    }
}
