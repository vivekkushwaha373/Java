package practiset01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;




class Student {
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }


    public String toString() {
        return "{ name: "+name + " and marks: "+marks+ "}";
    };

}

public class javapractise41 {
   public static void main(String[] args) {
      List<Student> li = new ArrayList<>();
      li.add(new Student("vivek",20));
      li.add(new Student("Aryan",100));
      li.add(new Student("Kanisa",30));
      li.add(new Student("Shruti",40));

    //   Collections.sort(li); // it internally uses comparable 
    //   Collections.sort(li,new shortname());
      Collections.sort(li,(a,b) -> a.name.compareTo(b.name));
      System.out.println(li);
    //   Collections.sort(li,new shortMarks());
      Collections.sort(li,new Comparator<Student>() {
         @Override
         public int compare(Student o1, Student o2){
            return o1.marks - o2.marks;
         }
      });
      
      System.out.println(li);
   }   
}


class shortname implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    };
}

class shortMarks implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks - o2.marks;
    };
}