package test03;

import java.util.*;

public class ArrayDequeDemo {
  public static void main(String[] args) {
    
    Deque<Integer> dq = new ArrayDeque<>();
    dq.push(1);
    dq.push(2); // offer means offerlast 
    dq.push(3);
    dq.push(4);
    dq.push(5);

    // while(dq.size()>0){
    //     System.out.println(dq.pop());
    // }

    System.out.println(dq.size());
    System.out.println(dq.peekFirst());
    System.out.println(dq.peekLast());
    System.out.println(dq.removeFirst());
    System.out.println(dq.removeLast());
    System.out.println(dq.);
     

  }    
}
