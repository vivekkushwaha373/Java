package practise;

import java.util.Stack;

// Note Linklist can also be used as stack using LinkList

// Linklist.addLast() // push
// Linklist.getLast() // peek
// Linklist.removeLast() // pop

// Note arrayList can also be used as stack 

public class stackdemo {
  public static void main(String[] args) {
     Stack<Integer> stack = new Stack<>();
     stack.push(1);
     stack.push(2);
     stack.push(3);
     System.out.println(stack);
     Integer pop = stack.pop();
     System.out.println(stack);
     System.out.println(stack.peek());
     System.out.println(stack.isEmpty());
     System.out.println(stack.size());
     System.out.println(stack.search(2));

  }
}
