package day17;

class GreetHello <T>{
     public T a;

     void setValue(T a){
        this.a=a;
     }

     T getValue(){
        return a;
     }

}

public class genericsDemo {
   public static void main(String [] args){
   // we are studing generics
      GreetHello <Integer> ob = new GreetHello<>();
      ob.setValue(10);
      System.out.println(ob.getValue());
   }   
}
