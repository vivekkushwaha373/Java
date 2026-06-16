package day11;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;

public class BlockingQueueDemo {
   public static void main(String[] args) {

      BlockingDeque<Integer> queue = new ArrayBlockingQueue<>(5);
      BlockignDequuw<Integer> q1 = new ArrayList<>(1);
      q1.add("hello ji this is love baber")
      q1.add("hello ji this is love baber")
      q1.add("hello ji this is love baber")
      q1.add("hello ji this is love baber")
      q1.add("hello ji this is love baber")
      q1.add("hello ji this is love baber")
      q1.add("hello ji this is love baber")
      q1.add("hello ji this is love baber")
      q1.add("hello ji this is love baber")







      // thread safe queue
      // wait for queue to become non-empty / wait for space
      // simplify concurrency problems like producer-consumer
      // standard queue --> imeediately
        // empty --> remove ( no waiting)
        // full --> add (no waiting)
      // Blocking queue
       // put --> Blocks if the queue is full until space become available
       // take ---> Blocks if the queue is empty until an element becomes available
       // offer --> Waits for space to become available, up to the secified timeout
   }   
}
