package practiset01;

import java.util.HashMap;
import java.util.Map;

public class javapractise38 {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "vivek");
        mp.put(2, "zainab");
        mp.put(3, "Rahman");
        mp.put(4, "Nandini");
        mp.put(5, "Kalyani");

        System.out.println(mp.containsKey(1));
        System.out.println(mp.containsValue("zainab"));
        System.out.println(mp.remove(3));
        System.out.println(mp.getOrDefault(1, "Aditya"));
        System.out.println(mp.replace(1, "hello"));
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());
        // System.out.println(mp.remove(3,"Rahman"));

        System.out.println(mp);
    }   
}
