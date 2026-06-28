package day18;

import java.util.*;

class Student implements Comparable<Student>{
   public String name;
   public int marks;
   
   Student(String name, int marks){
      this.name=name;
      this.marks=marks;
   }
   @Override
   public int compareTo(Student ob){
      return this.marks - ob.marks;
   } 


   @Override
   public String toString() {
       
      return "{name: "+this.name+" , marks: "+this.marks+"}";
   
   }

}

public class comparableInterfacedemo {
   public static void main(String[] args) {
      List <Student> list = new ArrayList<>();
      list.add(new Student("vivek",2));
      list.add(new Student("Rahul",10));
      list.add(new Student("Faizal",14));

      Collections.sort(list);
      System.out.println(list);

   }   
}
