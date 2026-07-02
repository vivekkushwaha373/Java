package day20;

import java.util.ArrayList;
import java.util.List;

// 1. parallel stream uses splitInterator (has two methods tryAdvnace(), trysplit()) Ho sake to parallelism use kr lena

// 2. it decompose source into parts then perform iteration 

// 3. Describe the source

// When to use parallel stream: 
// When data set is huge
// cpu intensive task
// stateless operations
// Optimisd data structure

//---> When Not to Use
// Data set small
// stateful
// shared mutable resource

public class parallelStreamdemo{
    
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));
       System.out.println("Sequential Stream");
       list.stream().map(x->x*2)
           .forEach(System.out::println);
    
       System.out.println("Parallel Stream Ordered");
       //parallel stream order is not same
       list.parallelStream().map(x->x*2).forEachOrdered(System.out::println);
       System.out.println("Parallel Stream UnOrdered");
       list.parallelStream().map(x->x*2).forEach(System.out::println);
    }

}