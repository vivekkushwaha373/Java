package day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
 public static void main(String[] args) {
     List<Integer> list = Arrays.asList(1,2,3);
     
     // 1. collect or toList in new java

     list.stream().skip(1).collect(Collectors.toList()) // collectors is a class calls static method 
     list.stream().skip(1).toList() // collectors is a class calls static method 

     // 2. forEach

     list.stream().forEach(x -> System.out.println(x));

     // 3. reduce : Combines elements to produce a single result
     Optional<Integer> optionalInteger = list.stream().reduce((x,y)-> x+y); // Interger::sum use method reference
     System.out.println(optionalInteger.get());

     // 4 count :

     // 5 anyMatch, allMatch , noneMatch

     boolean b = list.stream().anyMatch(x -> x%2 == 0);
     System.out.println(b);
     boolean b1 = list.stream().allMatch(x -> x > 0);
     System.out.println(b1);
     boolean b2 = list.stream().noneMatch(x -> x < 0);
     System.out.println(b2);

     // 6. findFirst, findAny

     System.out.println(list.stream().findFirst().get());
     System.out.println(list.stream().findAny().get());

     // 7. toArray()
     
     Object[] array = Stream.of(1,2,3).toArray();



     // 8. min / max

     Stream.of(2,44,69).max(Comparator.naturalOrder())
     

     // Examples: Filtering and Collecting names

     List<String> names = Arrays.asList("Anna","Bob","Charlie","David");
     System.out.println(names.stream().filter(x -> x.length() > 3).toList());

     // Example: Squaring and Sorting Numbers

     List<Integer> numbers = Arrays.asList(5,2,9,1,6);
     System.out.println(numbers.stream().map(x -> x * x).sorted().toList());

     // Example: Summing Values
     List<Number> intergers = Arrays.asList(1,2,3,4,5);
     System.out.println(intergers.stream().reduce(Integer::sum).get());
    
     // Exmaple: Couting Occurenece of a Character
     String sentence = "Hello World";
     System.out.println(sentence.chars().filter(x-> x == 'l').count());

     // stateful & stateless operations

 }   
}
