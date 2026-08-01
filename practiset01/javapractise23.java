package practiset01;

import java.util.ArrayList;
import java.util.List;
// public class javapractise23 {
//   public static void main(String[] args) {
//      List list = new ArrayList();
//      list.add("Hello");
//      list.add(2);
//      list.add("this");
     
//      String st = (String) list.get(0);
//      Integer st2 = (Integer) list.get(1);
    
//      // here the problem is Manual Casting and Runtime Failure

//      System.out.println(st);
//      System.out.println(st2);

//   }    
// }

public class javapractise23 {
  public static void main(String[] args) {
    
      List<? super Integer> list = new ArrayList<>();
      //Write Operation is Not allowed
      list.add(2);
      list.add(3);
      list.add(3);
      list.add(4);
      list.add(5);
    
      //   for(int i=0;i<list.size();i++){
    //     System.out.println(list.get(i));
    //   }

    //   for(Integer i : list){
    //     System.out.println(i);
    //   }
  }    
}
