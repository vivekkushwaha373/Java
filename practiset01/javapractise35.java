package practiset01;

import java.util.PriorityQueue;
import java.util.Queue;

public class javapractise35 {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>((a,b)-> b-a);
        q.offer(2);
        q.offer(1);
        q.offer(3);
        q.offer(4);

        System.out.println(q.peek());
        System.out.println(q.poll());


    }
}
