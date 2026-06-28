package day19;


// chaning demo in funtion

import java.util.function.*;
public class chaningcompositiondemofuntion {
 public static void main(String[] args) {
    Function<Integer, Integer> add2 = x-> x+2;
    Function<Integer, Integer> multiply3 = x-> x*3;

  System.out.println(add2.andThen(multiply3).apply(2));
  System.out.println(add2.compose(multiply3).apply(2)); // compose is inverse of andThen

 }   
}
