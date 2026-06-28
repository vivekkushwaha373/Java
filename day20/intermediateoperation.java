// intermediate operation

package day20;

import java.util.*;
import java.util.stream.Stream;

public class intermediateoperation{
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>(List.of(1,4,3,2,5));
    //    list.stream()
    //        .filter(x -> x % 2 == 0)
    //        .map(x -> x*2)
    //        .sorted((a,b)->b-a)
    //        .forEach(System.out::println);

    //    List<List<Integer>> list2 = List.of(
    //       List.of(1,2,3),
    //       List.of(3,4,5)
    //    ) ;

    //    list2.stream()
    //        .flatMap(x -> x.stream())
    //        .forEach(System.out::println);
            
     Stream.iterate(1, x->x+1)
           .limit(5).skip(1)
           .peek(System.out::println)
           .forEach(System.out::println);
   

    }
}


//filter
//map 
//flatmap 
//sorted -->stateful
//distinct() --> keep unique value uses hashing --> stateful
//limit()
//skip()
//peek() //mainly used for debugging
//maptoInt()
//maptoDouble()
