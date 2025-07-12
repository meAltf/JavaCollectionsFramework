package CollectionsFramework.Day_1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println(names);             // [Alice, Bob, Charlie]
        System.out.println(names.get(1));      // Bob

        names.remove("Bob");
        System.out.println(names);             // [Alice, Charlie]
    }
}
