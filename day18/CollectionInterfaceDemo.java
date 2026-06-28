package day18;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        Collection<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);

        int n = li.size();
 
        // .add() returns boolean
        // .remove() returns boolean and removes the first occurenece
        
        // toArray return Object [] but toArray(new Integer[0]) gives integer array

        // We can remove as well if we can add

        // It also returns boolean .addAll(collection<? extends E>)  li.addAll(List.of(1,2,3,4));

        // System.out.println(li); [1,2,3,4]

        // containsAll(collection<?>) returns boolean as well li.contains(List.of(1,2,3));

        // boolean removeAll(Collection<?> li)

        // boolean retainAll(Collection<?> c); --> Excpect intersection removal
        

        // .clear() clean the collection
    }
}


// add, remove, size, isEmpty, clear, toString, addAll, removeALL, retainAll, contains, containsAll, toArray