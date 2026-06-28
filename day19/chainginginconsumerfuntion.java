package day19;

import java.util.function.Consumer;

public class chainginginconsumerfuntion {
    public static void main(String[] args) {
        // Consumer<String> printName = x-> System.out.println(s);
        Consumer<String> printName = System.out::println;
        Consumer<String> printUpperCase = s->System.out.println(s.toUpperCase());

        Consumer<String> res = printName.andThen(printUpperCase);
        res.accept("helloji");

    }
}
