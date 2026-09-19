package test03;

public class GenericsDemo {

    public static void main(String[] args) {
            
        // Generics <String,Integer> generics = new Generics<>("Vivek", 23);
        AnotherGenerics generics = new AnotherGenerics<String,Integer>("Vivek",23);
        System.out.println(generics.custom("hello ji this is love babber"));
        System.out.println(generics.getName());
        System.out.println(generics.getAge());
    
    }

}
