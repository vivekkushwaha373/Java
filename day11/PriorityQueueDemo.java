package day11;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the queue interface
        // orders based on their natural ordering ( for peimitives lowest first)
        // custum comparator for customised ordering
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        
        System.out.println(pq);

        while(!pq.empty()){
            System.out.println(pq.poll());
        }
        // Internal working
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)
    }
}
