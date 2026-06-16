package day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
   public static void main(String[] args) {
      // Intermediate Operations transform a stream into another stream
      // They are lazy, meaning they don't execute until a terminal operation is invoked

      // 1 filter 
      
      List<String> list = Arrays.asList("Askhit","Ram","Shyam","Ghanshyam"); // src --> list
      Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A")); // intermediate operation
      // no filtering at this point 
      long res = list.stream().filter(x -> x.startsWith("A")).count();
      System.out.println(res);


      // 2 map

      Stream<String> stringStream = list.stream().map(x -> x.toUpperCase()); // (String::toUpperCase)

      // 3 sorted

      Stream<String> sortedStream = list.stream().sorted();
      Stream<String> sortedStreamUsingComparator = list.stream().sorted((a,b)-> a.length() - b.length());


      // 4. distinct

      long res1 = list.stream().filter(x->x.startsWith("A")).distinct().count();
      System.out.println(res1);

      // 5. limit

      System.out.println(Stream.iterate(1, x-> x+1).skip(10).limit(100)); 
     
      // 6. skip 

      System.out.println(Stream.iterate(1, x -> x+1).skip(10).limit(100).count());
      
      // 7. peek
      // Performs an action on each element as it is consumed.
      Stream.iterate(1,x -> x+1).skip(10).limit(100).peek(System.out::println).count();

      // 8. flatMap
      List<List<String>> listofLists = Arrays.asList(
         Arrays.asList("apple","banana"),
         Arrays.asList("orange","kiwi"),
         Arrays.asList("pear","grape")
      );

      

      System.out.println(listofLists.get(1).get(1));
      System.out.println(listofLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());



     
      List<String> senetences =  Arrays.asList(
         "Hello World",
         "Java streams are powerful",
         "flatMap is useful"
      );
      System.out.println(senetences.stream().flatMap(sentence-> Arrays.stream(sentence.split(" "))).map(String::toUpperCase).toList());

 // 8. min/max

      Stream.of(2.44,69).max(Comparator.naturalOrder())

     // 9 forEach Ordered

   //   when stream is parallelstream forEacg runs in arbitrary order so we can use forEachOrdered

     List<Integer> num =  Arrays.asList(1,2,3,4,5,6);
     num.parallelStream().forEach(System.out::println);
     num.parallelStream().forEachOrdered(System.out::println);


   }    
}
