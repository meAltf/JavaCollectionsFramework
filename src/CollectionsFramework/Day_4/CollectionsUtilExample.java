package CollectionsFramework.Day_4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtilExample {

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 9, 1, 7);

        Collections.sort(nums);
        System.out.println("Sorted: " + nums); // [1, 3, 5, 7, 9]

        Collections.reverse(nums);
        System.out.println("Reversed: " + nums); // [9, 7, 5, 3, 1]

        System.out.println("Max: " + Collections.max(nums)); // 9
    }
}
