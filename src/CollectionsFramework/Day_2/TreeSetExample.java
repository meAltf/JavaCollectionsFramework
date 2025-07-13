package CollectionsFramework.Day_2;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(30);
        numbers.add(10);
        numbers.add(20);

        System.out.println(numbers); // [10, 20, 30] — automatically sorted
    }
}
