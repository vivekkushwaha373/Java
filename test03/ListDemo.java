package test03;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
    list.forEach(System.out::println);
    System.out.print("==================================\n");
    list.retainAll(list);
    list.get(1);
    list.set(0,2);
    System.out.println(list);
    list.add(1,9);
    System.out.println(list);
    list.remove(1);
    System.out.println(list);
    list.remove(Integer.valueOf(2));
    list.remove(Integer.valueOf(2));
    System.out.println(list);
    list.addFirst(5);
    System.out.println(list);
    list.addLast(89);
    System.out.println(list);
    System.out.println(list.indexOf(3));
    // System.out.println(list.remove(Integer.valueOf(5)));
    System.out.println(list);
    System.out.println(list.contains(3));
    System.out.println(list.indexOf(100));
    System.out.println(list.size());
    // System.out.println(list.addAll(list));
    System.out.println(list.toArray(new Integer[0]));
    System.out.println(list.subList(0, 4));
    System.out.println(list);
    List<Integer> listnew = List.of(5,3,4,5,89);
    System.out.println(list.equals(listnew));
    System.out.println(list.hashCode());
    System.out.println(listnew.hashCode());
    // System.out.println();
    
  }   
}
