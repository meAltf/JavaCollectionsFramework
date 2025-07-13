package CollectionsFramework.Day_3;

import java.util.HashMap;
import java.util.Map;

public class PracticeQuestion {

    public static void main(String[] args) {
        Map<String, Integer> fruitMap = new HashMap<>();

        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 5);
        fruitMap.put("Mango", 12);
        fruitMap.put("Apple", 15); // Overwrites old value

        System.out.println("Fruit Stock:");
        for (String fruit : fruitMap.keySet()) {
            System.out.println(fruit + ": " + fruitMap.get(fruit));
        }
    }
}
