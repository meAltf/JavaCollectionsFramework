package CollectionsFramework.Day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeQuestions {

    private static void reverseNumList(List<Integer> numList){
        Collections.reverse(numList);
    }

    public static boolean containsName(List<String> names, String targetName) {
        return names.contains(targetName);
    }

    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(10,20,30, 40, 50);
        reverseNumList(numsList);
        for(int num : numsList){
            System.out.print(num + " ");
        }

        System.out.println();

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String nameToCheck = "Bob";

        if (containsName(names, nameToCheck)) {
            System.out.println(nameToCheck + " : is in the list.");
        } else {
            System.out.println(nameToCheck + " : is NOT in the list.");
        }
    }
}
