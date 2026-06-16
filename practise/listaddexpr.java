package practise;

import java.util.ArrayList;
import java.util.List;

class Animal{

}

class Dog extends Animal{

}

class Cow extends Animal{

}

public class listaddexpr {
  
    public static void main(String[] args) {
       List<Animal> li = new ArrayList<>();
       li.add(new Dog());     
       li.add(new Cow());

       List<Dog> li2 = new ArrayList<>();
       li2.add(new Dog());
       li2.add(new Dog());
       li =li2;
       
    //    for(Number l : li){
    //      System.out.println(l);
    //    }
    }
    
}
