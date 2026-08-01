package practiset01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class javapractise32 {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.offer(1);  // equivalent to add however add  gives Exception if not able to add
        dq.offer(2);
        dq.offer(3);
        


        System.out.println(dq);
        System.out.println(dq.peek()); 
        System.out.println(dq.poll());
        System.out.println(dq);
        // System.out.println(dq.getFirst());
        // System.out.println(dq.getLast());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

    }
}
