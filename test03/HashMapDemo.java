package test03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer,Integer> mp1 = new LinkedHashMap<>(Map.of(1,2,3,4,5,6));
        mp1.put(9,10);
        System.out.println(mp1.getClass());
        System.out.println("value of key 1: "+ mp1.get(1));
        // System.out.println(mp1.);
        // how to iterate a map

        // for( Map.Entry<Integer,Integer> mp:mp1.entrySet()){
        //     System.out.print(mp.getKey()+" : ");
        //     System.out.println(mp.getValue());
        // }

        mp1.forEach((key,value)->{
               System.out.print(key+" : ");
            System.out.println(value);
        });

        Set<Integer> set = mp1.keySet();
        
        Set<Integer> set2 =new HashSet<>(mp1.values());

        List<Integer> list  = new ArrayList<>(mp1.values());

        System.out.println(set);
        System.out.println(set2);
        System.out.println(list);
        System.out.println(mp1.containsKey(1));
        System.out.println(mp1.isEmpty());
        System.out.println(mp1.getOrDefault(100, 23));
        System.out.println(mp1.size());
        System.out.println(mp1.computeIfPresent(1,
            (k,v)->k+v)
        );
        System.out.println(mp1.containsValue(2));
        System.out.println(mp1.get(1));
        System.out.println(mp1.merge(1, 20, (k,v)->k+v));
        System.out.println(mp1.get(1));
        System.out.println(mp1.replace(1, 100));
        System.out.println(mp1.get(1));
        // mp1.remove
        mp1.putAll(Map.of(200,344,768,244));
         mp1.forEach((key,value)->{
               System.out.print(key+" : ");
            System.out.println(value);
        });

        // System.out.println(mp1.reta);

    }
}
