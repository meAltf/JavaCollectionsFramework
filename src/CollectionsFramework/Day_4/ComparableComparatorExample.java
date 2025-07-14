package CollectionsFramework.Day_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Student implements Comparable<Student>{
    int marks;
    Student(int marks){
        this.marks = marks;
    }

    @Override
    public int compareTo(Student smarks) {
        return this.marks - smarks.marks; // ascending order
        /*
                > 0 (positive)	this is greater than smarks | this comes after
                < 0 (negative)	this is less than smarks    | this comes before
                0	this is equal to smark
         */
    }
}

public class ComparableComparatorExample {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(85));
        students.add(new Student(92));
        students.add(new Student(76));
        students.add(new Student(90));

        Collections.sort(students);

        ListIterator<Student> listIterator = students.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next().marks + " ");
        }

        /**
         * comparator
         * // Sort ascending by marks using Comparator
         *  students.sort((s1, s2) -> s1.marks - s2.marks);
         */

    }

}
