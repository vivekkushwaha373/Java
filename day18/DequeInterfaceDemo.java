package day18;

import java.util.ArrayDeque;

public class DequeInterfaceDemo {
    public static void main(String[] args) {
        Deque<Interger> queue = new ArrayDeque<>();
        //as a single ended queue
        queue.add(1); // exception on fail
        queue.offer(2); // return false on fail
        queue.offer(3);
    
        System.out.println(queue.peak()); // queue.element() also does the same
        
        queue.remove(); //throw exception
        queue.poll(); //safe return null

        //RECOMMEDED USE: offer, poll and peak

        // offerfirst --> push
        // offerlast
        // pollfirst --> pop
        // polllast
        // peekfirst --> peek
        // peeklast

    }

}
