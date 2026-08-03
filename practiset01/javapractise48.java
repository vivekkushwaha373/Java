package practiset01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class javapractise48 {
    public static void main(String[] args) {
        //  List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        //  list.stream().

        // Stream.iterate(1, x->x+1).limit(10).skip(5).forEach(System.out::println);
        // Stream.generate(()->"helloji").limit(10).forEach(System.out::println);

        List<List<Integer>> list  = new ArrayList<>(List.of(List.of(1,2,3),List.of(4,5,6)));
        System.out.println(list);
        // list.stream().flatMap(x->x.stream()).forEach(System.out::println);
    //    int cnt =  list.stream().flatMap(x->x.stream()).mapToInt(x->x).sum();
    //    OptionalDouble cnt =  list.stream().flatMap(x->x.stream()).mapToInt(x->x).average();
    //    OptionalInt cnt =  list.stream().flatMap(x->x.stream()).mapToInt(x->x).min();
    //    OptionalInt cnt =  list.stream().flatMap(x->x.stream()).mapToInt(x->x).max();
    //    System.out.println(cnt.getAsInt());
     



         
    }
}
