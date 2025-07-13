package CollectionsFramework.Day_3;

import java.util.HashMap;
import java.util.Map;

public class PracticeQuestion {

    private static void FrequencyCounter() {
        int[] arr = {1, 2, 1, 3, 2, 1, 4};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

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

        FrequencyCounter();
    }
}
