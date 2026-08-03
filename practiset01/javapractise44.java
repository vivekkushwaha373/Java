package practiset01;

import java.util.function.Consumer;
import java.util.function.Function;

public class javapractise44 {
    public static void main(String[] args) {
        Function<Integer,Integer> fn1 = x -> x*2;
        Function<Integer,Integer> fn2 = x -> x*3;
        Function<Integer,Integer> fn3 = x -> x*2;
        Consumer<Integer> cn1 = System.out::println;
        Consumer<Integer> cn2 = x -> System.out.println("digit: "+x);
        System.out.println(fn1.andThen(fn1).andThen(fn2).andThen(fn3).apply(3)); 
        System.out.println(fn1.apply(fn2.apply(3)));
        System.out.println(fn1.compose(fn1).compose(fn2).compose(fn3).apply(3)); 
        cn1.andThen(cn2).accept(fn1.apply(20));


    }
}

// fn3(fn2(fn1(fn1)))