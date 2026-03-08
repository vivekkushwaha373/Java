package day06;
import practise.classdemo;

class subclass extends classdemo{
    static void display(){
        System.out.println(x);
    }
}

public class accessclass {
    public static void main(String[] args) {
        subclass ob1 = new subclass();
        ob1.display();
    }
}
