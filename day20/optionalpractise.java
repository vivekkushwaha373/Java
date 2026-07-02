package day20;

import java.util.Optional;

public class optionalpractise {
  public static void main(String[] args) {
      Address ad = new Address();
      ad.city = "GKP";

      Student st = new Student();
      st.ad = Optional.of(ad);   // optional.of can not be null 
      Optional<Student> op = Optional.of(st);

      Optional<String> city = op
      .flatMap(x->x.ad)
      .map(y->y.city);
    

      System.out.println(city.get());


      

  }  
}


class Student{
 public Optional<Address> ad;
}

class Address{
  public String city;
} 