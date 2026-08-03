package day20;

import java.util.Optional;

// map
// filter
// flatMap
public class chaininginOptional {
    public static void main(String[] args) {
        Student st = new Student("vivek", "Bangalore");
        Optional<Student> s1 = Optional.of(st);
        
        s1.map(x->x.address)
          .map(x->x.city)
          .ifPresent(System.out::println);
        
        s1.map(x->x.address)
          .map(x->x.city)
          .filter(x->x.length()>2)
          .ifPresent(System.out::println);
    }
}


class Student{
    String name;
    Address address;
    Student(String name, String city){
         this.name=name;
         this.address = new Address(city);
    }
}

class Address{
    
    String city;
    
    Address(String city){
        this.city=city;
    }

}
