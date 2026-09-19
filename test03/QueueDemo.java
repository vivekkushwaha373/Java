package test03;

import java.util.PriorityQueue;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        //this is bydefault a min heap
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        // System.out.println(queue.element());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.addAll(List.of(6,7,8)));
        System.out.println(queue);
        System.out.println(queue.isEmpty());
        System.out.println(queue.contains(2));
        System.out.println(queue.remove(5));
        System.out.println(queue);
    }
}
