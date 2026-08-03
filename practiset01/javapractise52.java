package practiset01;

import java.util.function.Supplier;

public class javapractise52 {
    public static void main(String[] args) {
        String str = "vivek";
        Supplier<Integer> sp = str::length; 
        System.out.println(sp.get());
    }
}
