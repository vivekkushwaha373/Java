package test03;

public class AnotherGenerics<U,T extends Number> extends Generics<U,T>{
    
     public AnotherGenerics(U name, T age) {
        super(name,age);
     }
}
