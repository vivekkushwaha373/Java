package day09;

// lambda expression is a shortcut to use functional Interface

@FunctionalInterface // only used for compile time validation
interface InnerFuntionalInterfaceDemo {
    
    int add(int a, int b);
    
    default void m1(){
        System.out.println("Hello ji this is love babber");
    }
    
}

public class FuntionalInterfaceDemo {
    int a=3;
    int b=8;
    public void main(String[] args) {
        InnerFuntionalInterfaceDemo opra = (a,b)->a+b;
        System.out.println(opra.add(a,b));
    }
}
