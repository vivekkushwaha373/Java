package test03;

import java.util.*;

public class GenericsWildcards {
   
    public static void main(String[] args){
         List list = new ArrayList<Integer>();
         List <Integer>list = new ArrayList<Integer>();
         list.addAll(List.of(1,2,3,4,5,6,7));
         System.out.println(list);

         List<? extends Number> list2 = list;
         System.out.println(list2);
        //  list2.add(90);
        //  System.out.println(list2);
        
    }

}