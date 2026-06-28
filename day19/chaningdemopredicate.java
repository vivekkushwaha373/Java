package day19;

import java.util.function.Predicate;

// add
// or
// negate

public class chaningdemopredicate {
    public static void main(String[] args) {
        Predicate<Integer> isGreater = x -> x > 100;
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isGreater.or(isEven).test(102));

        Predicate<Integer> isOdd = isEven.negate();
        System.out.println(isGreater.or(isEven).test(20));
        System.out.println(isGreater.and(isEven).test(20));
        System.out.println(isGreater.and(isEven).negate().test(20));
    }
}
