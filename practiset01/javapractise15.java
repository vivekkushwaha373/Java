package practiset01;

import java.lang.classfile.attribute.SourceIDAttribute;

//Let's Study exception handling

public class javapractise15 {
    

    static int getDivisor(int a,int b){
      System.out.println("Get dividor method starts");
      int ans = a/b;
      System.out.println("Get dividor methods Ends");
      return ans;
    }
  
    public static void main(String[] args) {
        try{

            System.out.println(getDivisor(2,0));
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    
  }   
}
