package practise;

class Greet{

    String sayhello;

    Greet(String name){
      sayhello = name;
    }

}

class Greet1 extends Greet{
   
   String sayhello;
   
   Greet1(String name){
    super(name);
   }

   String getGreet(){
    return sayhello;
   }
}

public class test01 {
   public static void main(String[] args) {
      Greet1 g = new Greet1("Hello ji kya haal chal apke");
      System.out.println(g.getGreet());

   }     
}
