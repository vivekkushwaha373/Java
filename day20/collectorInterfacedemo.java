package day20;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class collectorInterfacedemo {
  public static void main(String[] args) {
     List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
    //  List<Integer> list2 = list.stream().map(x->x+1).collect(Collectors.toList());
    //  Set<Integer> set = list.stream().map(x->x+1).collect(Collectors.toSet());
    //  Map<Integer,Integer> mp = list.stream().collect(Collectors.toMap(x-> x+1, x->x+2));
    //   Map<Boolean,List<Integer>> mp =  list.stream().collect(Collectors.partitioningBy(x->x%2==0));
    //   System.out.println(mp);

     List<String> list3 = new ArrayList<>(List.of("AA","BBB","CC","D","EEEE","F"));
    // Map<Integer, List<String>> mp = list3.stream().collect(Collectors.groupingBy(x->x.length()));
    // Map<Integer, List<String>> mp = list3.stream().collect(Collectors.groupingBy(x->x.length(),Collectors.mapping(x -> x.toLowerCase(), Collectors.toList())));
    //  System.out.println(mp);
    
     String result = list3.stream().collect(Collectors.joining("-"));
     System.out.println(result);
     
  }    
}
