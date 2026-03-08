//constructor

class greet{
   greet(String s){
    this.hello =new String(s);
    System.out.println("My constructor is called");
  }
  String hello;
  
   void sayhell(){
      System.out.println("saying hello to "+hello);
   } 
}
public class Vivek{
  public static void main(String[] args) {
      System.out.println("hello ji this is love babber");
      greet s1;
      s1 = new greet("vivek");
      s1.sayhell();
      
  }
}
