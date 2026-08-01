package practiset01;

import java.util.LinkedList;

public class javapractise31 {
   public static void main(String[] args) {
     LinkedList<Integer> list = new LinkedList<>();
     list.add(2);
     list.add(3);
     list.add(4);
     list.set(0, 1);
     list.offer(45);
     list.remove(0);
     System.out.println(list);
     list.removeLast();
     list.getFirst();
     list.removeFirst();
     list.getLast();
     System.out.println(list);
     System.out.println(list.indexOf(90));
     System.out.println(list.lastIndexOf(4));
     System.out.println(list.peek());
     System.out.println(list.poll());
     System.out.println(list.poll());
     // list clone is not supported in linkedlist

   }   
}
