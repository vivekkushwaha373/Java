package day11;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2); // here still u can modify map1 and can't map2 in java 8

        // java 9
        Map<String, Integer> map3 = Map.of("shubham",2,"vivek",34); // only ten entries of key value allowed not effcient
        // map3 is immutable  
        // to allow as many entries as u want 
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 23), Map.entry("shubham",2));
        
    }
}
