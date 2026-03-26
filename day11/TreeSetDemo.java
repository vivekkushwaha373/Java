package day11;

import java.util.Set;
import java.util.TreeSet;
/*
It sorts the set 

*/
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(60);
        set.add(20);
        set.add(60);
        set.add(10);
        set.add(0);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.size());

    }
}
