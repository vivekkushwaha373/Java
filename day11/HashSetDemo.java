package day11;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> ob = new HashSet<>();
        ob.add(1);
        // ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(4);
        ob.add(6);
        ob.add(6);
        ob.add(2);
        ob.add(7);
        ob.add(90);
        ob.add(6);

        System.out.println(ob);
    }
}
