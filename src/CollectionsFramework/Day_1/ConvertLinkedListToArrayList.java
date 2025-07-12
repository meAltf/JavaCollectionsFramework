package CollectionsFramework.Day_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedListToArrayList {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Red");
        linkedList.add("Green");
        linkedList.add("Blue");

        // convert LinkedList to ArrayList
        ArrayList<String> convertedArrayList = new ArrayList<>(linkedList);

        System.out.println("Converted ArrayList : " + convertedArrayList);
    }
}
