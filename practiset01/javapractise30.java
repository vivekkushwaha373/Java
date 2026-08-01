package practiset01;

import java.util.ArrayList;
import java.util.List;

public class javapractise30 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        list.addFirst(56);
        System.out.println(list);
        list.addLast(23);
        System.out.println(list);
        list.remove(Integer.valueOf(56));
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.containsAll(List.of(1,2,3,4)));
        System.out.println(list.contains(2));
        System.out.println(list.retainAll(List.of(1,2,3,4)));
        System.out.println(list);
        System.out.println(list.size());
        list.forEach((x)->{
            System.out.println(x);
        });

        System.out.println(list.getClass().getName());
        System.out.println(list.indexOf(2));
        System.out.println(list.lastIndexOf(2));
        // list.clear();
        // System.out.println(list);
        System.out.println(list.equals(List.of(1,2,3,4)));
        System.out.println(list.subList(0, 4));
        System.out.println(list.reversed());
        list.replaceAll(x -> x*2);
        System.out.println(list);
        list.add(1,56);
        System.out.println(list);
        list.set(0,9);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        // removeFirst
        // removeLast
        



    }
}
