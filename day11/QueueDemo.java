package day11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<Integer> list = new LinkedList<>();
    list.add(1);
    System.out.println(list.size());

    System.out.println(list.remove()); // throws exception if empty 
    System.out.println(list.poll());  // better it gives null 

    System.out.println(list.element()); // throw exception if empty
    System.out.println(list.peek());

    Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
    System.out.println(queue2.add(1)); // true
    System.out.println(queue2.offer(2)); // true
    System.out.println(queue2.offer(3)); // throws exception
    

  }    
}
