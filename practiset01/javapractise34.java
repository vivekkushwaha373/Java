package practiset01;

import java.util.ArrayDeque;
import java.util.Deque;

public class javapractise34 {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(1); // offerfirst
        dq.push(2);
        dq.push(3);
        System.out.println(dq);
        System.out.println(dq.pollFirst());// pollLast
        System.out.println(dq);
        System.out.println(dq.peek());
        

    }
}
