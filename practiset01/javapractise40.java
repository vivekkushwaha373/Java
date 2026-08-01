package practiset01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int marks;

    Student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        return o.marks - this.marks;
    }

    public String toString() {
        return "{ name: "+name + " and marks: "+marks+ "}";
    };

}

public class javapractise40 {
   public static void main(String[] args) {
      List<Student> li = new ArrayList<>();
      li.add(new Student("vivek",100));
      li.add(new Student("Aryan",20));
      li.add(new Student("Kanisa",30));
      li.add(new Student("Shruti",40));

      Collections.sort(li);
      System.out.println(li);
   }   
}
