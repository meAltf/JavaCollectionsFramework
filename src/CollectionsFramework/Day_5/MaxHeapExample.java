package CollectionsFramework.Day_5;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeapExample {

    /**
     * min heap changes to max heap
     * using this : Collections.reverseOrder()
     */

    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.add(40);
        maxHeap.add(10);
        maxHeap.add(30);

        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " "); // 10, 30, 40
        }
    }
}
