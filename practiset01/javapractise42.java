package practiset01;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Let's study about Functional Interface

public class javapractise42 {
public static void main(String[] args) {
   Function <Integer,Integer> f1 = new Funtionaldemo();
   System.out.println(f1.apply(12));  
   Supplier <Integer> sp = new Supplierdemo();
   System.out.println(sp.get());
   Consumer<Integer> cn = new Consumerdemo();
   cn.accept(100);
   Predicate<Integer> pr = new predicatedemo();
   System.out.println(pr.test(100));
}    
}


class Funtionaldemo implements Function<Integer,Integer>{
    // @Override
    public Integer apply(Integer x){
        return x*2;
    }


}

class Supplierdemo implements Supplier<Integer>{
 
    public Integer get(){
        return 10;
    }
}

class Consumerdemo implements Consumer<Integer>{
    @Override
    public void accept(Integer x){
        System.out.println("Accepted: " + x);
    }
}

class predicatedemo implements Predicate<Integer>{
    public boolean test(Integer x){
        return  x%2 == 0;
    }
}
