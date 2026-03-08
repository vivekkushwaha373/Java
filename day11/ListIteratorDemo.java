package day11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("JAVA","DSA","Devops","Python","MLOPS"));
        ListIterator<String> iter = list.listIterator();

        while(iter.hasNext()){
            String value = iter.next();
            if(value.equals("Python")){
                iter.set("Cloud");
            }
            System.out.println(value);
        }
        System.out.println("========================================");
        while(iter.hasPrevious()){
            System.out.println(iter.previous());
        }

    }
}
