package day19;

import java.util.function.Supplier;

// T get()

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Double> randomvalue = ()->Math.random();
        System.out.println(randomvalue.get());
    }
}
