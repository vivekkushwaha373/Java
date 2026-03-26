package day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// In java coparator in an interface which has abstract method called compare 

class customcoprator implements Comparator<Integer>{
     
    @Override
    public int compare(Integer o1, Integer o2) {
        return o1 - o2; // for ascending order    o1 comes before o2 when it gives o1 - o2 gives negative 
    }
    
}


// there is another way apart from labmda expression to create comparator 

//   Comparator <Student> comparator = Comparator.comparing(Student :: age);
class Student{
    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name=name;
    }

    int age(){
        return this.age;    
    }
    
}




// 3-5 =-2 ---> 3,5 order
// 5-3= 2 --->  3,5 order

public class ComparatorDemo {
    public static void main(String[] args) {
      
        List<Integer> list =  new ArrayList<>();
         list.add(1);
         list.add(3);
         list.add(2);
         System.out.println(list);
         list.sort(new customcoprator());
        // list.sort((a,b)->a-b); // this is eqivalent to above line no need to give implementation to Comparator
        // Collections.sort(list,(a,b)->a-b);
         System.out.println(list);
         
    } 
     
    }
