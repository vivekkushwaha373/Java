package test02;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionInterfacedemo {
   public static void main(String[] args) {
    BiFunction <Integer,Integer,Integer> bifn = (x,y)->x+y;  
    Function<Integer,Integer> fn = (x)->x+2;
    Function<Integer,Integer> fn2 = (x)->x*3;
    Integer ans = fn.andThen(fn2).apply(2);
    Integer ans2 = fn.compose(fn2).apply(2);
    System.out.println(bifn.apply(2,3));
    System.out.println(ans);
    System.out.println(ans2);


    Consumer<String> studentinfo = (name)->{
        
        System.out.println("My name is "+name);
    };

     Consumer<String> teacherinfo = (name)->{
        
        System.out.println("My name is "+name);
    };

    


    studentinfo.andThen(teacherinfo).accept("Abhilash");

   }   
}
