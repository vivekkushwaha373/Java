package practiset01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class javapractise29 {

    public static void main(String[] args) {
        Collection <Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        System.out.println(list.addAll(Arrays.asList(2,3,4)));
        System.out.println(list.addAll(List.of(90)));
        System.out.println(list.remove(2));
        System.out.println(list.removeAll(List.of(1,2,3,4,5)));
        System.out.println(list.containsAll(List.of(1,2,3)));
        System.out.println(list.size());
        list.addAll(List.of(1,2,3,4,5,6,7,8,9,10));
        list.removeIf((x)->x%2 == 0);
        System.out.println(list);
        System.out.println(list.isEmpty());
        list.retainAll(List.of(1,2,3,5));
        System.out.println(list);

        for(Integer i : list.toArray(new Integer[0])){
            System.out.println(i);
        }

        System.out.println(list.toString());
        list.clear();
        System.out.println(list);
        
    }

}
