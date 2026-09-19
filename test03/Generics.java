package test03;

public class Generics<U, T extends Number> {

    // this is properties

    private U name;
    private T age;

    // this is constructor

    public static <Y> Y custom(Y message) {
        return message;
    }

    public Generics(U name, T age) {
        this.name = name;
        this.age = age;
    }
    
    // instance ,methods can have their own type Or class type

    // but static methods must have thier own type

    
    U getName() {

        return name;
    }

    T getAge() {

        return age;
    }

    // public <Z> void custominstance(Z message) {
    //     System.out.println(message);
    // }

}
