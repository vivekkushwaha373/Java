package day10;


//Concept of autoboxing and autounboxing

public class WrapperClassDemo {
    public static void main(String[] args) {
        Integer a=234; // Integer.valueOf(1) // autoboxing
        Integer c=234;
        int b =  a;        // a.intValue(); //autounboxing
        System.out.println(b); 
        System.out.println(Integer.MAX_VALUE);
        System.out.println(a.equals(c));

    }
    
}
