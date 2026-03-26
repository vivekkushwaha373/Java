package day11;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapdemo {
  public static void main(String[] args) {
    LinkedHashMap <String, Integer> linkedhashmap = new LinkedHashMap<>(2,0.5f, true);
    linkedhashmap.put("Orange",10);
    linkedhashmap.put("Apple",10);
    linkedhashmap.put("Guava",10);
    
    linkedhashmap.get("Apple");

    for(Map.Entry<String, Integer> entry : linkedhashmap.entrySet()){
        System.out.println(entry.getKey()+ " : "+entry.getValue());
    }
    linkedhashmap.putIfAbsent("vivek",2 );
    linkedhashmap.getOrDefault("vivek", 0);
         
  }   
}
