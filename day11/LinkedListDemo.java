package day11;

import java.util.LinkedList;

/*
In java when an interface is empty like Interface RandomAccess{}
Then it is called marker Interface 
This interface is implemented by ArrayList class not by LinkedList class
because when we do get(id) in ArrayList then JVM allows us to get element at given id
using random access even it is empty.
Howwver when we do get in LinkedList it doesn't call random access just iterate linklist to given id times 

*/

public class LinkedListDemo {
 
    public static void main(String[] args) {
        
        LinkedList<String> list = new LinkedList<>();
        list.add("vivek");
        list.add("sweta");
        list.add("simran");
        list.add("vishal");
        
        String first = list.getFirst();
        String last = list.getLast();

        System.out.println(first);
        System.out.println(last);
        System.out.println(list.get(2));


    }
}
