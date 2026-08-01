package practiset01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class javapractise39 {
  public static void main(String[] args) {
    Map<Integer,String> mp = new HashMap<>();
    mp.put(1,"vivek");
    mp.put(2,"Nirbhai");
    mp.put(3,"Murli");

    // using iterator how to iterate this
    Iterator<Map.Entry<Integer,String>> itr =   mp.entrySet().iterator();

    // while(itr.hasNext()){
    //    Map.Entry<Integer,String> m = itr.next();
    //    System.out.println(m.getKey() + " " + m.getValue());
      
    // }
    for(Map.Entry<Integer,String> m : mp.entrySet()){
        System.out.println(m.getKey() + " " + m.getValue());
    }
  }    
}
