package day15;

public class LocalClassDemo {
  
    static int  display(){
        final int x=0;
        class helloji{
        //   int x=9;
          void display(){
            System.out.println("Printing x : "+x);
          }
        }

        helloji ob = new helloji();
        ob.display();
        return x;
    }
    public static void main(String[] args) {
      System.out.println(display()); 
  }   
}
