package day19;
import java.util.function.*;
// void accept(t T)

public class ConsumerInterface {
    public static void main(String[] args) {
        Function<Integer,Integer> square = x->x*x;
        Consumer<Integer> print = x->System.out.println(x);
        print.accept(7);  
    }
}
