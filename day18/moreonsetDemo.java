package day18;

import java.util.HashSet;

public class moreonsetDemo {
   public static void main(String[] args) {
     Set<Integer> set = new HashSet<>(); // empty hashset
     Set<Integer> set2 = new HashSet<>(100); // capacity only
     Set<Integer> set3 = new HashSet<>(100, 0.8f); // capacity , Load factor

     Set<Integer> set4 = new HashSet<>(List.of(1,2,3,4,5,6,7,8,9));


   }    
}
