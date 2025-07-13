package CollectionsFramework.Day_2;

import java.util.*;

public class PracticeQuestion {

    private static void RemoveDuplicatesPreserveOrder(List<String> names) {
        // LinkedHahSet preserve the insertion order
        Set<String> uniquesNames = new LinkedHashSet<>(names);
        System.out.print("Unique names in order of insertion " + uniquesNames);
    }

    private static void UniqueSortedNames(List<String> names) {
        // TreeSet removed duplicates and give in sorted order
        Set<String> uniqueSorted = new TreeSet<>(names);
        System.out.print("Unique names in alphabetical sorted order " + uniqueSorted);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zara", "Mohan", "Amit", "Zara", "Amit");

        RemoveDuplicatesPreserveOrder(names);
        System.out.println();
        UniqueSortedNames(names);

    }
}
