package day18;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
   public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    set.add(80);
    set.add(23);
    set.add(10);
    set.add(90);
    set.add(50);

    // Sorted Interface

    System.out.println(set.first()); //10 smallest value
    System.out.println(set.last());  //90 largest value
    System.out.println(set.headSet(80)); // smallest to 80 excluding 80
    System.out.println(set.tailSet(80)); //largesest to 80 invcludive 80
    System.out.println(set.subSet(23, 80)); // 23 is inclusive and 80 is exclusive

    // Navigable set

    //greatest number smaller than  80
    System.out.println(set.lower(80));

    // greatest element less than or equal to 80
    System.out.println(set.floor(80));

    //smallest number greater than 80
    System.out.println(set.higher(80));

    // smallest number greater than or equal to 80
    System.out.println(set.ceiling(80));

    System.out.println(set.pollFirst()); // will get remove 10 smallest 
    System.out.println(set.pollLast()); // will remove 90 largest

    System.out.println(set.first()); //will return smallest
    System.out.println(set.last()); // will return largest

    System.out.println(set.descendingSet());

    Iterator<Integer> it = set.descendingIterator();

    while(it.hasNext()){
        System.out.println(it.next());
    }

    // overides

    System.out.println(set.headSet(80, true)); // it includes 80
    System.out.println(set.tailSet(10,false));
    System.out.println(set.subSet(10, false,80, true));


   }   
}
