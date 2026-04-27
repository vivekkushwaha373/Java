package day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsDemo {
    public static void main(String[] args) {
        // Stream is an interface in Java
        // feature introduced in java 8
        // process collections of data in a functional and declarative manner
        // Simplify Data Processing
        // Embrace Functional Programming
        // Improve Readibility and Maintainibility 
        // Enable Easy Parallellism

        // How to Use Stream?
        // Source, intermediate operation & terminal Operation

        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5)); // numbers is a source here
        Long cnt = numbers.stream().filter(x -> x%2 == 0).count(); // filter in an intermediate operation // count is terminal operation
        System.out.println("count is: "+cnt);
        
        //// Creating Streams
        
        // 1. From Collection
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        
        // 2. From Arrays
        String[] arrays = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arrays);

        // 3. Using Stream.of()
        Stream<String> stream2 = Stream.of("a","b");

        // 4. Infinite streams
        Stream<Integer> generate = Stream.generate(()->1);
        
        // 5.  
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);
    }
}
