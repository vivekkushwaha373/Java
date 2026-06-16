package day17;


// static method should have their own type parameter but instance method type parameter will use class one
class Greet<T>{
    static <T> void greethello (T value){
       System.out.println(value);
    }  
}

public class genericswithstaticMethods {

    public static <U> U GreeHello(U a) {
        return a;
    }

    public static void main(String[] args) {
        System.out.println(GreeHello("Hello ji this is love babber"));
        Greet <String> ob = new Greet<>();
        ob.greethello("hello ji");
    }
}
