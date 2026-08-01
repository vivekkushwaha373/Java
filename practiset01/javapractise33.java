package practiset01;

import java.util.ArrayDeque;
import java.util.Deque;

public class javapractise33 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(1);
        dq.offerLast(2);
        dq.offerLast(3);
        dq.offerLast(4);
        dq.offerLast(5);
        dq.offerFirst(10);
        System.out.println(dq);
        // System.out.println(dq.getLast());
        // System.out.println(dq.getFirst());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
