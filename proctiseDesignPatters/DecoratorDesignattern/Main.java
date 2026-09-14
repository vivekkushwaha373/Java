package DecoratorDesignattern;

public class Main {
   public static void main(String[] args) {
      System.out.println("Client: Ananya Ka number Dedo");
      
      try{
          Thread.sleep(2000);
      }catch(Exception e){}

      System.out.println("Server Respond: ");

      Student st = new Student("Ananya", 7078282530L);
      DecorateStudent student = new DecorateStudent(st);
      System.out.println(student.getName());
      System.out.println(student.getMobileNumber());
   }   
}
