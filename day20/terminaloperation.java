package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class terminaloperation {
    public static void main(String[] args) {
         //Terminal Operations
         List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
        //  list.stream().map(x->x+1).forEach(System.out::println);
        //  List<Integer> list2 = list.stream().map(x->x+1).toList(); //immutable list
        //  List<Integer> list2 = list.stream().map(x->x+1).collect(Collectors.toList()); //mutable list
        // Optional<Integer> sum =  list.stream().reduce((a,b)->a+b);
        // int sum =  list.stream().reduce(0,(a,b)->a+b);
        // System.out.println(sum.get());
        // Optional<Integer> num =  list.stream().filter(x->x>2).findAny();
        // Optional<Integer> num =  list.stream().filter(x->x>2).findFirst();
        // long num = list.stream().filter(x->x>2).count();
        // boolean num = list.stream().filter(x->x>2).anyMatch(x->x>3);
        // boolean num = list.stream().filter(x->x>2).allMatch(x->x>3);
        // boolean num = list.stream().filter(x->x>2).noneMatch(x->x>3);
        // [sum() max() min() average() works with primitives only
        
        // int sum = list.stream()
        //               .filter(x -> x >0)
        //               .mapToInt(x->x)
        //               .sum();

        // OptionalInt max = list.stream()
        //               .filter(x -> x >0)
        //               .mapToInt(x->x)
        //               .max();
    
        // System.out.println(max.getAsInt());

        // OptionalDouble avg = list.stream()
        //               .filter(x -> x >0)
        //               .mapToInt(x->x)
        //               .average();
    
        // System.out.println(avg.getAsDouble());


        System.out.println(list);
    }
}

//List of Terminal Operations
//collecting results --> toList(), collect()
//reducing opeation reduce() [sum() max() min() average()] count()
//searching/matching --> findFirst() findAny(), anyMatch(), allMatch() noneMatch()
//Interators-->forEach() forEachOordered()

//collector is an interface
//collectors is a class with utility methods