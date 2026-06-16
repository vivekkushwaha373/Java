package practise;

abstract class model{
   final int a;
   model(){
    a =4;
   }
   abstract void takeinput(int a);
   void modelname(String str){
      System.out.println("model name is "+str);
   }
} 

class carmodel extends model{
    @Override
    void takeinput(int v){
        System.out.println(v);
    }
}

public class abstractDemo {
    public static void main(String[] args) {
        carmodel ob = new carmodel();
        ob.takeinput(3); 
        ob.modelname("Farrari");
        System.out.println(ob.a);
    }
}
