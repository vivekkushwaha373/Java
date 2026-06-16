package practise;

import java.util.ArrayList;

public class ListDemo {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(2,10); // for injecting   [1,2,10,3]
       list.set(2,3); // for replacement  [1,2,3,3]
       list.remove(Integer.valueOf(2));
       System.out.println(list);



    }
}
