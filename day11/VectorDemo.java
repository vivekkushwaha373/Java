package day11;

import java.util.Enumeration;

// vector is thread safe

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> item = new Vector<>();
        item.add(10);
        item.add(20);
        item.add(30);
        System.out.println(item);
        //Note: ListIterator can also be used
        Enumeration<Integer> e = item.elements(); // read only traversal works only for legacy class(vector, stack, hashtable) goes only forward
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
    }
}
