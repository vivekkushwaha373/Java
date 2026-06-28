// sequencial collection interace--> getFirst(), getLast(), addFirst(), addLast(), removeFirst(), removeLast()

package day18;

import java.util.*;

// get(i) set(index, E value), add(index, E value)
public class ListInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.get(0));
        System.out.println(list);
        list.set(0,5);
        System.out.println(list);
        list.add(4,7);
        System.out.println(list);
        list.addAll(List.of(1,2,3,4));
        System.out.println(list);
        list.indexOf(2);
        list.lastIndexOf(2);
        ListIterator<Integer> li = list.listIterator();

        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

        // list.remove(2);
        // list.remove(Interger.valueof(2));
        

        // List.of this is immutable also check List.copyOf

    }
}


// new ArrayList(10) //initial capacity
// new ArrayList<>(collcion)

// list.ensureCapacity() modify the list capacity to 100

// list.trimToSize() trim the empty posostosn

// list.capacity() // how much it can hold
// list.size() // number of elements hold

// LinkedList always uses doubly list


// vector and stack are legacy classes and thread safe and no longer used because they are slow
// stack extends vector
