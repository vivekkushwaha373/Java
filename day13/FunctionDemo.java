//Function is also an functional Interface with avsbtrac method is   R apply(T t);
// Consumer is also a functional Interface with abstract method is void accept(T t);
// supplier ' ' ''      is T get();

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionDemo {
 public static void main(String[] args) {
    Function<Integer, Integer> doubleIt = x -> x*2;
    Function<Integer, Integer> tripleIt = x -> x*3;
    System.out.println(doubleIt.andThen(tripleIt).apply(20));
    System.out.println(doubleIt.compose(tripleIt).apply(20));
    System.out.println(doubleIt.apply(20));
    // use
    Function<Integer,Integer> identity = Function.identity();
    Integer res2 = identity.apply(5); // it resturns same as what u give
    System.out.println(res2);


    //Consumer

    Consumer<Integer> consumer  = x -> System.out.println(x);
    consumer.accept(51);
    List<Integer> list = Arrays. asList(1,2,3);
    Consumer<List<Integer>> printlist = x->{
        for(int i : x){
            System.out.println(i);
        }
    };
    printlist.accept(list); 


    // supplier
    Supplier<String> giveHelloWorld = ()-> "Hello world";
    System.out.println(giveHelloWorld.get());

    // combined example
    Predicate <Integer> predicate = x -> x%2 == 0; // test
    Function<Integer, Integer> function = x->x*2; // apply
    Consumer<Integer> consumer2 = x-> System.out.println(x); // accept
    Supplier<Integer> supplier = ()->100; // get 
       
   if(predicate.test(supplier.get())){
    consumer2.accept(function.apply(supplier.get()));
   }


   //BiPredicate, Biconsumer, BiFunction 

   BiPredicate<Integer, Integer> isSumEven = (x,y)->(x+y)%2 == 0;
   System.out.println(isSumEven.test(5,5));
   BiFunction<String, String , Integer> biFunction = (x,y)->(x+y).length();
   System.out.println(biFunction.apply("hello","ji")); 
   BiConsumer<Integer, String> biConsumer = (x,y)->{
     System.out.println(x);
     System.out.println(y);
   };
   System.out.println(biConsumer);

   //Unianry operator
   UnaryOperator<Integer> a = x -> 2*x; // Function<Integer,Integer> identity = Function.identity();
   BinaryOperator<Integer> b = (x,y) -> x+y; // Bifunction

   //Method reference
   
   


 }    
}
