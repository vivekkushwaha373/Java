package test03;

import java.util.*;

public class IteratorDemo {
    public static void main(String[] args) {
        
       List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
       
       ListIterator <Integer> itr = list.listIterator();
       
       while(itr.hasNext()){
         Integer ans = itr.next();
         if(ans == 3){
            itr.remove();
         }
         list.set(0, 99);
         System.out.println(ans);
       }

        while(itr.hasPrevious()){
         Integer ans = itr.next();
         if(ans == 3){
            itr.remove();
         }
         list.set(0, 99);
         System.out.println(ans);
       }

       System.out.println(list);



    }
}
