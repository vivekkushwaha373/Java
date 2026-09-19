package test03;

import java.util.Comparator;

class Student{
    String name;
    Integer rollno;
    
    Student(String name,Integer rollno){
        this.name = name;
        this.rollno = rollno;
    }

}

class nameCompare implements Comparator<String>{
     public int compare(String o1, String o2) {
          return o1.equals(o2)? 0:1;
     };
}

// class rollnoCompare implements  Comparator<Integer>{
//     public int compare(Integer o1, Integer o2) {
//           int res = o1.equals(o2)? 0 : 1;
//           return res;
//     };
// }


public class ComparatorInterface {
    public static void main(String[] args) {
        Student st  = new Student("vivek", 48);
        // rollnoCompare cmp = new rollnoCompare();
                                      
        Comparator<Integer> rollnComparator  =  (a,b)-> Integer.compare(a, b);
        
                 if(rollnComparator.compare(st.rollno, 48)==0){
            System.out.println("roll is equal");
        }
    }
}
