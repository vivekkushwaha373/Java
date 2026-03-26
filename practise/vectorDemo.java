package practise;

import java.util.LinkedList;
import java.util.Vector;


// isEmpty
// contains
// clear
// add
// capacity
// remove
// size
// set
// get

public class vectorDemo {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>(5,3); // given capacity
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1); //6
        list.add(1);
        list.add(1);
        System.out.println(list.capacity());
        LinkedList<Integer>linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);
       Vector<Integer>vector = new Vector<>(linkedlist);
       System.out.println(vector);
      
    }
}
