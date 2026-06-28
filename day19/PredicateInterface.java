package day19;

import java.util.function.Predicate;

// bool test(T t)

public class PredicateInterface {
  public static void main(String[] args) {
    Predicate<Integer> isEven = (x)-> x%2 == 0;
    Predicate<Integer> isGreater = x -> x>100;
    System.out.println(isGreater.or(isEven).test(20));
    System.out.println(isGreater.and(isEven).test(20));
    System.out.println(isGreater.and(isEven).negate().test(20));
    // System.out.println(isEven.test(8));
  }   
}
