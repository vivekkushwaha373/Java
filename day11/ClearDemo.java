package day11;

import java.util.ArrayList;
import java.util.List;

public class ClearDemo {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            li.add(i + 1);

        if (li.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            System.out.println(li);
            System.out.println("List is not Empty");
        }
       
        li.clear();

        if (li.isEmpty()) {
            System.out.println("List is Empty");
        } else {
            System.out.println(li);
            System.out.println("List is not Empty");
        }

    }
}
