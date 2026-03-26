package day11;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentitfyHashMapDemo {
    public static void main(String[] args) {
         String key1 = new String("key");
         String key2 = new String("key");
         System.out.println(System.identityHashCode(key1)); // check for object hashcode
         System.out.println(System.identityHashCode(key2)); // hence both are not equal and duplicated in Identityhashmap
         System.out.println(key1.hashCode()); // check for content hashcode
         System.out.println(key2.hashCode()); // check for content hashcode hence both are equal and replace in Hashmap
         Map<String, Integer> mp = new IdentityHashMap<>();
         mp.put(key1,1);
         mp.put(key2,2);
         System.out.println(mp);

    }
}
