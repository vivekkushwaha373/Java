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
        li.remove(2); // returns boolean and removes the first occurenece
        
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



// package day18;

// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.List;

// public class CollectionInterfaceDemo {

//     public static void main(String[] args) {
//         Collection <Integer> list = new ArrayList<>();

//         list.add(2);
//         list.add(3);
//         System.out.println(list.addAll(Arrays.asList(2,3,4)));
//         System.out.println(list.addAll(List.of(90)));
//         System.out.println(list.remove(2));
//         System.out.println(list.removeAll(List.of(1,2,3,4,5)));
//         System.out.println(list.containsAll(List.of(1,2,3)));
//         System.out.println(list.size());
//         list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
//         list.removeIf((x)->x%2 == 0);
//         System.out.println(list);
//         System.out.println(list.isEmpty());
//         list.retainAll(List.of(1,2,3,5));
//         System.out.println(list);

//         for(Integer i : list.toArray(new Integer[0])){
//             System.out.println(i);
//         }

//         System.out.println(list.toString());
//         list.clear();
//         System.out.println(list);
        
//     }

// }
