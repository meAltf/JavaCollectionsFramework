package CollectionsFramework.Day_5;

import java.util.PriorityQueue;

public class MinHeapExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(40);
        minHeap.add(10);
        minHeap.add(30);

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.poll() + " "); // 10, 30, 40
        }
    }
}
