package CollectionsFramework.Day_5;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Task1");
        queue.offer("Task2");
        queue.offer("Task3");

        System.out.println("Next: " + queue.peek());  // Task1
        System.out.println("Processing: " + queue.poll()); // Task1
        System.out.println("Remaining: " + queue); // [Task2, Task3]
    }
}
