// Predicate is a functional interface which has abstract method Boolean test(T t);

import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
    
    Predicate<Integer> isEven = (x)-> x % 2 == 0;
    Predicate<Integer> isOdd = (x)-> x % 2 != 0;
    Predicate<Integer> isEvenAndOdd = isEven.and(isOdd);
    Predicate<Integer> isEvenOROdd = isEven.or(isOdd);
    System.out.println(isEven.test(4));
    System.out.println(isEvenAndOdd.test(2));
    System.out.println(isEvenOROdd.test(2));

  }   
}
