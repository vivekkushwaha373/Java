package practiset01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class javapractise51 {
    public static void main(String[] args) {
         List<String> list = new ArrayList<>(List.of("vivek","aman","simran","praneeth","Vipin"));
         System.out.println(list); 
        //  Map<Boolean, List<String>> out = list.stream().collect(Collectors.partitioningBy(x->x.startsWith("v"))); 
        //  Map<Integer, List<String>> out = list.stream().collect(Collectors.groupingBy(x->x.length()));
        //  Map<Integer, List<String>> out = list.stream().collect(Collectors.groupingBy(String::length,Collectors.mapping(String::toUpperCase, Collectors.toList())));
        //  Map<Integer, List<String>> out = list.stream().map(String::toUpperCase).collect(Collectors.groupingBy(String::length));
        //  Map<Integer, List<String>> out = list.stream().collect.grounpingBy(String::length, String::toUpperCase));


         System.out.println(out);      
    }

}
