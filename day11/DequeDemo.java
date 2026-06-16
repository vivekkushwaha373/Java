package day11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {
        // double ended queue
        // allows insertion and removal of elements from both ends
        // versatile than regular queues and stacks because they support all the operation of both

        Deque<Integer> deque1 = new ArrayDeque<>();
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        // 5, 10, 20, 25
        System.out.println(deque1);
        System.out.println("First Element : "+deque1.getFirst());
        System.out.println("Last Element: ", deque1.getLast());
        deque1.removeFirst();
        deque1.pollFirst();

        for(int num: deque1){
            System.out.println(num);
        }
    }
}
