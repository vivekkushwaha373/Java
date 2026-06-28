package day18;

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        
        // Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a); // max heap
        Queue<Integer> pq = new PriorityQueue<>(); //min heap
        pq.offer(10); 
        pq.offer(2); 
        pq.offer(3); 
        pq.offer(4); 
        pq.offer(5);
        
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
         

    }
    
}
