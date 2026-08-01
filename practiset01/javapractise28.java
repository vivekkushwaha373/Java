package practiset01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class javapractise28 {
   public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Iterator itr = list.iterator();

        while(itr.hasNext()){
            list.set(0,7);
            System.out.println(itr.next());
            // itr.remove();
        }
        System.out.println("The Size is: " + list.size());

        ListIterator li = list.listIterator(list.size());

        while(li.hasPrevious()){
            System.out.println(li.previous());
     
        }

        System.out.println("/=/====================================/");

        while(li.hasNext()){
            System.out.println(li.next());
            System.out.println("next index: "+ li.nextIndex());
            System.out.println("prvious index: "+li.previousIndex());
        }
    }    
}
