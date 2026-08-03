package practiset01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

class Student{
    String name;
    Integer roll_no;

    Student(String name, Integer roll_no){
        this.name =name;
        this.roll_no =roll_no;
    }
    Student(String name){
        this.name =name;
        this.roll_no =roll_no;
    }

    public String toString(){
        return "{"+name+" , "+roll_no+"}";
    }

}

public class javapractise53 {
   public static void main(String[] args) {
    
//    List<Student> li = new ArrayList<>(List.of(new Student("vivek", 1),new Student("ayush", 2),new Student("simran", 3)));
//    System.out.println(li);
     

      List<String> li = new ArrayList<>(List.of("vivek","ayush","abhishek"));

     Stream<Student> st =  li.stream().map(Student::new);

     List<Student> newlist = st.toList();

     System.out.println(newlist);
      
   


   }   
}
