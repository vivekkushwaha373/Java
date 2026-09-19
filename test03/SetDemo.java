package test03;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>(List.of(1,2,3,4));
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.contains(1));
        System.out.println(set.containsAll(Set.of(1,2,3)));
        System.out.println(set.containsAll(List.of(1,2,3)));
        System.out.println(set.add(3));
        // System.out.println(set.removeIf(k->k>=2));
        System.out.println(set);
        set.forEach(System.out::println);
        System.out.println(set.retainAll(List.of(1,2,3)));
        System.out.println(set.toArray(new Integer[0]));

    }
    
}
