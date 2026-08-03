package practiset01;
//Now we will be studying predicate

import java.util.function.Predicate;

public class javapractise45 {
    public static void main(String[] args) {
        Predicate<Integer> p = x-> x%2 == 0;
        Predicate<Integer> p1 = x-> x > 10;
        
        System.out.println(p.and(p1).negate().test(12));
        System.out.println(p.and(p1).test(12));
        System.out.println(p.or(p1).test(10));
    }
}
