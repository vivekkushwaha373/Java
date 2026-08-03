package practiset01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class javapractise55 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,1 , 2 ,2, 3, 4, 5, 6,6, 7, 8, 9, 10));
        System.out.println(list.stream().filter(x -> x % 2 == 0).toList());
        System.out.println(list.stream().filter(x -> x > 15).toList());
        System.out.println(list.stream().map(x -> x * x).toList());
        System.out.println(list.stream().sorted().toList());
        System.out.println(list.stream().sorted((a, b) -> b - a).toList());
        System.out.println(list.stream().reduce(0, (a, b) -> a + b));
        System.out.println(list.stream().filter(x -> x % 2 == 0).count());
        System.out.println(list.stream().mapToInt(x -> x).max());
        System.out.println(list.stream().mapToInt(x -> x).min());
        System.out.println(list.stream().mapToInt(x -> x).average());
        list.stream().limit(5).forEach(System.out::println);
        list.stream().skip(3).forEach(System.out::println);
        System.out.println(list.stream().anyMatch(x -> x > 25));
        System.out.println(list.stream().allMatch(x -> x >= 0));

        List<String> str = new ArrayList<>(List.of("vivek","vivek", "babber", "Dhairya", "chandan", "survi"));
        System.out.println(str.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println(str.stream().filter(x->x.startsWith("R")).toList());
        System.out.println(str.stream().distinct().map(String::toLowerCase).sorted().toList());

        System.out.println(list.stream().sorted((a,b)->b-a).skip(1).findFirst());

        System.out.println(list.stream().collect(Collectors.toList()));
        System.out.println(list.stream().collect(Collectors.toSet()));

        System.out.println(list.stream().collect(Collectors.groupingBy(x->x,Collectors.counting())));

        System.out.println(list.stream().collect(Collectors.toMap(Function.identity(),x->1,(a,b)->a+b)));



       System.out.println(list.stream().collect(Collectors.groupingBy(x -> x%2==0 ? "even":"odd")));
       System.out.println(list.stream().collect(Collectors.groupingBy(x -> x%2==0 ? "even":"odd",Collectors.counting())));
       System.out.println(list.stream().collect(Collectors.groupingBy(x -> x%2==0 ? "even":"odd",Collectors.reducing((a,b)->a+b))));
       list.stream().

       
        


    }
}
