package day11;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;
// Sortedmap is an interface which extends map interface and TreeMap implements navigable map which itself extends Sorted map
// tree map internally implements Red black tree
// navigable map provides navigable methods

public class TreeMapdemo {
  public static void main(String[] args) {
    //   SortedMap<Integer,String> map = new TreeMap<>();
    //   map.put(1,"vivek");
    //   map.put(2,"ayush");
    //   map.put(3,"rahul");
    //   System.out.println(map);
    //   System.out.println(map.firstKey());
    //   System.out.println(map.lastKey());
    //   System.out.println(map.containsKey(1));
    //   System.out.println();
      NavigableMap<Integer,String> map = new TreeMap<>();
      map.put(1,"vivek");
      map.put(2,"ayush");
      map.put(3,"rahul");
      System.out.println(map);
      System.out.println(map.firstKey());
      System.out.println(map.lastKey());
      System.out.println(map.containsKey(1));
      System.out.println(map.lowerKey(2)); // just less than the given key //1
      System.out.println(map.ceilingKey(2)); // equal or greater

  }   
}
