package CollectionsFramework.Day_4;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Golang", "Python", "AI");
        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()) {
            String language = listIterator.next();
            if (language.equals("AI")) {
                listIterator.set("C++");
            }
        }

        // print after change
        while (listIterator.hasPrevious()) {
            System.out.print(listIterator.previous() + " ");
        }
    }
}
