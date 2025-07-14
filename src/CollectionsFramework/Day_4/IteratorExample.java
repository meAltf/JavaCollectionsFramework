package CollectionsFramework.Day_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Python", "Golang", "C++");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
