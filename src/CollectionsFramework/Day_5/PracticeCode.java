package CollectionsFramework.Day_5;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PracticeCode {

    private static List<Integer> KLargestElements(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : nums){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll(); // Remove the smallest | to find K Largest.
            }
        }
        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10, 99};
        List<Integer> result = KLargestElements(arr, 4);
        for(int num : result){
            System.out.print(num + " " );
        }
    }
}
