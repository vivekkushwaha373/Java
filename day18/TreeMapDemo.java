package day18;

import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        // Map<Integer, String> map2 = new HashMap<>(10);
        // Map<Integer, String> map3 = new HashMap<>(10,0.9f); //capacity + loadfactor
       map.put(102,"aditya");
       map.put(103,"vivek");
       map.put(104,"Abhisek");

       System.out.println(map.firstKey());
       System.out.println(map.lastKey());
       System.out.println(map.lowerKey(102)); //
       System.out.println(map.higherKey(103));
       System.out.println(map.floorKey(102));
       System.out.println(map.ceilingKey(103));
       System.out.println(map.firstEntry());
       System.out.println(map.lastEntry());
       System.out.println(map.descendingMap());
    //    System.out.println(map.pollFirstEntry());
       System.out.println(map.headMap(103));
       System.out.println(map.subMap(102, 104));
    }
}
