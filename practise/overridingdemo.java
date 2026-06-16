package practise;

class Animal{

 void speaks(){
    System.out.println("animal language");
 }

}

class Dog extends Animal{
 @Override
  void speaks(){
    System.out.println("Dog's Voice");
  }
  
}

class Cow extends Animal{
   @Override
   void speaks(){
    System.out.println("cow's voice");
   }
}

public class overridingdemo {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.speaks();

        Animal an = new Dog(); //at run it will check object type and bind 
        an.speaks();
    }
}
