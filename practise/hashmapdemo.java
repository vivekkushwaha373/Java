package practise;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmapdemo {
    public static void main(String[] args) {
        HashMap <Integer, String>map = new HashMap<>();
        map.put(1,"hello");
        map.put(2,"ji");
        map.put(3,"this");
        map.put(3,"is ");
        map.put(4,"babber");
       System.out.println(map);
       System.out.println(map.get(3));
       System.out.println(map.containsKey(2));
       System.out.println(map.containsValue("ji"));

       Set<Integer> keys = map.keySet();
       for(int i : keys){
          System.out.println(map.get(i));
       }
       Set<Map.Entry<Integer, String>> entries = map.entrySet();
       for(Map.Entry<Integer, String> entry:entries){
         System.out.println(entry.getKey()+ " : " + entry.getValue());
       }
       for(Map.Entry<Integer, String> entry:entries){
        //  System.out.println(entry.getKey()+ " : " + entry.getValue());
        entry.setValue(entry.getValue().toUpperCase());
       }
       System.out.println(map.entrySet());


           
    }
}
