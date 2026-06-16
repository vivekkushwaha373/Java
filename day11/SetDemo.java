package day11;

import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetDemo {
    public static void main(String[] args) {
       // Set is a collection that connot duplicate elements
       // faster operations
       Set<Integer> set = new HashSet<>(); // to maintian the order use linkedHashset // if i want sorted order use tree set
       set.add(12);
       set.add(1);
       set.add(1);
       set.add(67);
       System.out.println(set);       
       System.out.println(set.contains(12));
       System.out.println(set.remove(67));
       set.clear();
       
       // fot thread safety
       
       Set<Integer> set1 = new ConcurrentSkipListSet<>();

       // unmodifiable set

       Set<Integer> interger = Set.of(1,2,3,4,5,6,7,8,9,10);
       Collections.unmodifiableSet(null) // pass any set to make it unmodifiable

       


    }
}
