package day14;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
  public static void main(String[] args) {
    
    long startTime = System.currentTimeMillis();
    List<Integer> list = Stream.iterate(1, x -> x+1).limit(20000).toList();
    List<Long> factorialList = list.stream().map(ParallelStream::factorial).toList();
    long endTime = System.currentTimeMillis();
    System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");
    
    
    startTime = System.currentTimeMillis();
    // List<Integer> list = Stream<T>.iterate(1, x-> x+1 null).limit(20000).toList();
    factorialList = list.parallelStream().map(ParallelStream::factorial).toList();
    endTime = System.currentTimeMillis();
    System.out.println("Time taken with sequential stream: " + (endTime - startTime) + " ms");


    // Parallel strems are most effective for CPU-intensive or large datasets where tasks are independent
    // They may add overhead for simple tasks or small datasets

    // cummulative sum--> here parallel stream is not applicable
    // [1,2,3,4,5] --> [1,3,6,10,15];
    int sum=0;
    List<Integer> list = Array.asList(1,2,3,4,5)
                        list.stream().map(x->{
                         int i = x+sum;
                         sum = i;
                         return i;
                        }).toList();
    
    
  } 
  
  public static long factorial(int number){

    long result=1;
    for(int num=2 ; num<=number;num++){
        result*=num;
    }

    return result;

  }
}
