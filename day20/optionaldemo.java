package day20;

import java.util.Optional;

// we introduced optional to avoid Null Check Hell
// optional class is wrapper over Object

//creating optionals

// Optional<String> n = Optional.of("Aditya");
// Optional<String> n = Optional.ofNullable("Aditya or nULL")
// if want to return Null only use Optional.isEmpty();
// It has isPresent or ifPresent
// get() risky if null
// orElse()
// orElseGet()
// orElseThrow()
// ifPresentorElse()


public class optionaldemo {
 
  public static Optional<String> getName(){
    return Optional.of("hello");
  }
  public static Optional<String> getName2(){
    return Optional.empty();
  }
  public static Optional<String> getName3(){
    return Optional.ofNullable(null);
  }
    public static void main(String[] args) {
     Optional<String> name = getName();
     System.out.println(name.get());
     Optional<String> name2 = getName2();
     if(name2.isPresent()){
        System.out.println(name2);
     }
     Optional<String> name3 = getName3();
     //  name3.ifPresent(System.out::println);
    //  System.out.println(name3.orElse("Unknown")); //always evalue orelse part 
    //  System.out.println(name3.orElseGet(()->"Unknown")); // doesn't evalue orelseif part if not null
    // System.out.println(name3.orElseThrow());
    name3.ifPresentOrElse(System.out::println, ()->System.out.println("Unknown"));

 }    
}
