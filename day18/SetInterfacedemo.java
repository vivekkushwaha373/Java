package day18;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetInterfacedemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("vivek");
        set.add("Zoya");
        set.add("Abhishek");
        set.add("Aviral");

        System.out.println(set.contains("Aviral"));

        Map<Integer, String> map  = new HashMap<>();
        map.put(101,"Aditya");
        map.put(102,"Rahul");
        map.put(103,"Vinay");

        System.out.println(map.containsKey(101));
        System.out.println(map.get(102));
        
    }
}
