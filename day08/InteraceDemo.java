package day08;

/*
Important OPPS concept

1 the override works in run time and hence static method can not be overridden because it is decided at compile time
2 Also while overriding a method from prent to child the access modefires in child can not be less than parent 

*/

/*

in abstract class a few methods are abstract and a few are concrete methods

in interface all methods are 100% abstract by default

in interface child class has to implement all methods, it is compulsory

*/

// In abstract class we have constructor because we have to initialize variables
// However in interface the variables itsef is final hence it can not be left declared without initilization so we do not 
// require constructor there


/*
Note after java 1.8 or java 8  interface and abstract has almost no difference because we can create static and default methods
as well which may not nessarily abstract

in abstract class properties are mutable however in interface it is not. Also constructer in asbstract class can be made bot not in interface

*/

interface Demo {

 int a=10; //by default --> public , static , final
 // for methods 

 void display();// by default--> abstract, public note: we can also make it default explicitly after java 1.8 or java 8 
}


class Test implements Demo{
    @Override
    public void display(){
        System.out.println("hello");
    }
}

public class InteraceDemo {

    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }

}
