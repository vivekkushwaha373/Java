package day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInterfaceDemo {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);

        Iterator it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        //shortcut

        for(Integer i : li){
            System.out.println(i);
        }

    }
}
