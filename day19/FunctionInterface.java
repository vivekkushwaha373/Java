package day19;

import java.util.function.*;

// Function interface   has apply methods which is R apply(T t)

public class FunctionInterface {
    public static void main(String[] args) {
        Function<Integer, Integer> square = x->x*x;
        System.out.println(square.apply(5));
    }

}
