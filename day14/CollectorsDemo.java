package day14;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //Colleting to a list
        List<String> name = Arrays.asList("Alice","Bob","Charlie");
        List<String> res = name.stream().filter(name->name.startsWith("A")).collect(Collectors.asList());
        System.out.println(res);

        //Collecting to a set
        List<Integer> nums= Arrays.asList(1,2,2,3,5,6);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3 collecting to a Specific Collection
        ArraysDeque<String> collect = name.stream().collect(Collectors.toCollection(()-> new ArrayDeque<>()));

        // 4. Joining Strings
        String concatenate = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenate);

        //5 . Summarizing Data
        // Generates statistical summary (count, sum, min, average,max);

    }
}
