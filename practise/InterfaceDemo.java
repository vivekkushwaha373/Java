package practise;

interface Animal {

    String name = "vivek"; // bedefault final static and public
    default void greet(){
        System.out.println("hello ji this is love babber 1");
    }
}

interface Human{
  String name = "vivek";
  default void greet(){   // this method can also be overridden
    System.out.println("hello ji this is love babber 2");
  }
} 
//multiple inheritance is also possible here
class anotherAnimal implements Animal, Human{
    public void greet(){

        Animal.super.greet();
    }    
//   @Override
//   public void greet(){
//     System.out.println("hello ji this is love babber");
//   }
}

public class InterfaceDemo{
    public static void main(String[] args) {
        anotherAnimal ob = new anotherAnimal();
        System.out.println(Animal.name);
        ob.greet();
        Animal ob2 = new anotherAnimal();
        ob2.greet();
    
    }
}
