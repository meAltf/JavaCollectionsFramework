package CollectionsFramework.Day_5;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        deque.addFirst("Start");
        deque.addLast("End");

        System.out.println(deque); // [Start, End]

        deque.removeFirst(); // removes "Start"
        deque.removeLast();  // removes "End"
    }
}
