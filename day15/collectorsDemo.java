package day15;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

// collectors is a utility class 

public class collectorsDemo {
   public static void main(String[] args) {
      

     // 1. Collecting to a list
     List<String> str = Arrays.asList("Alice","Bob","Charlie");
     List<String> res = str.stream()
                        .filter(name -> name.startsWith("A"))
                        .collect(Collectors.toList());
     System.out.println(res);

     // 2. collecting to a Set
     List<Integer> nums = Arrays.asList(1,2,3,4,4,5,6,7,7,8,4);
     Set<Integer> set =  nums.stream().collect(Collectors.toSet());
     System.out.println(set);

     // 3. collecting to a specified collection
     
     ArrayDeque<String> collect = str.stream().collect(Collectors.toCollection(()-> new ArraysDeque<>()));

     // 4. Joining Strings
     // concatinates stream element into a single String
     String concatenatedNames = str.stream().map(String::toUpperCase).collect(Collectors.joining(", ")) ;
     System.out.println(concatenatedNames);

     // 5. Summarizing Data
     // Generate statical summary (count, sum, min, average, max)
     List<Integer>numbers = Arrays.asList(2,3,5,7,11);
     IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x->x));
     System.out.println("Count: "+stats.getCount());
     System.out.println("Sum: "+stats.getSum());
     System.out.println("Min: "+stats.getMin());
     System.out.println("Average: "+stats.getAverage());
     System.out.println("Max: "+stats.getMax());

     // Direct Methods

     // 6 calculating Elements
     Double average = numbers.stream().collect(Collectors.averagingDouble(x->x));
     System.out.println(average);

     //7.  Counting Elements
     Long count = numbers.stream().collect(Collectors.counting());
     System.out.println("Count: "+ count);

     //8. Grouping Elements
     List<String> words = Arrays.asList("hello","world","java","streams","collecting");
     words.stream().collect(Collectors.groupingBy(x->x.length));
     words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(", "))); // thi will retuen string {4=[java] 5= [hello, world]}
     words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting())); {4=1, 5=2}
     words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));

     // 9. Partitioning Elements
     // Partitions elements into two groups (true or false) based on predicate

     words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5));  // {false=[hello,world, java], true =[streams, collecting]}


    // 10. Mapping and collecting 
    // Applies a mapping function before colleccting
    
    // shourcut for .map
    System.out.println(words.stream().collect(Collectors.mapping(x->x.toUpperCase(), Collectors.toList())));

    // Example 1: Collecting Names by length
    List<String> l1= Arrays.asList("Anna","Bob","Alexender","Brain","Alice");
    l1.stream().collect(Collectors.groupingBy(String::length));

    // ExAMPLE 2: counting words by Occuerence
    String sentence = "hello world hello java world";
    Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x->x, Collector.counting()));

    // Example 3: Partitioning Even and Odd numbers
    List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
    System.out.println(l2.stream().collect(Collectors.partitioningBy(x-> x%2 == 0)));  //{ true:[], false:[]}
    
    // Example 4: Summing values in a map
    Map<String, Integer> items = new HashMap<>();
    items.put("Apple",10);
    items.put("Banana",20);
    items.put("Orange",15);
    System.out.println(items.values().stream().reduce(Integer::sum));
    items.values().stream().collect(Collectors.summingInt(x-> x));

    // Example 5: Creating a Map from stream Elements
    List<String> fruits = Arrays.asList("Apple","Banana","Cherry");
    fruits.stream().collect(Collectors.toMap(x-> x.toUpperCase(), x -> x.length()));

    // Example 6:
    List<String> words2 = Arrays.asList("apple","banana","apple","orange","banana","apple");
    words2.stream().collect(Collectors.toMap(x->x,v->1,(x,y)->x+y)); // merge funtion is given here

   }   
}
