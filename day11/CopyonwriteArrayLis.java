package day11;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// This is introduced to make copy on write operation
// faster than vector with enabled threadsafe
// This is introduced when u have more than one thread so instead of using vector go for copyonwrite arraylist
// used effectely when write operation is less than read operation because it consiumes lot of memory


public class CopyonwriteArrayLis {
    public static void main(String[] args) {
      List<Integer> list = new CopyOnWriteArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);
     // write operation is only possible while iteration using copyonwrite operation
      for(Integer item : list){
          if(item == 2) 
            list.add(4);
          System.out.println(item);
      }

      System.out.println(list);
    }
}
