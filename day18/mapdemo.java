package day18;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
// hello ji this is love babber
public class mapdemo {
   public static void main(String[] args) {
      Map<Integer, String> map = new HashMap<>();
      map.put(101,"Aditya");
      map.put(102,"Rohit");

      map.size();
      map.isEmpty();

      map.containsKey(101);
      map.containsValue("Aditya");
      
      
      System.out.println(map.put(102,"vivek")); // map,put return null when enter a new value but return old value when it updates
    //   map.remove(101);

      Map <Integer, String> map2 =new HashMap<>();
      map.putAll(map2);
      map.clear(); // it clears the map
      
      Set<Integer> set = map.keySet();
      System.out.println(set);

      Collection<String> c = map.values(); // it returns a collectiom

      Set<Map.Entry<Integer, String>> entries1= map.entrySet();
      System.out.println(entries1);
      System.out.println(map.getOrDefault(105, "Unknown"));
      System.out.println(map.putIfAbsent(102, "Hello ji"));
      map.remove(101);
      map.remove(101,"Nikita");
      map.replace(101, "Rohan"); // update if exists not create like put

     Set<Map.Entry<Integer,String>> entries = map.entrySet();

     for(Map.Entry<Integer,String> entry : entries ){
         Integer key = entry.getKey();
         String value = entry.getValue();
         System.out.println(key+" , "+value);
     }

     // Lets create an Immutable Map

     Map<Integer, String> mp = Map.of(101,"vivek",102,"kushwaha",103,"helloji");
    //  mp.put(103,"Rohan"); it will throw an error

     



   }   
}
