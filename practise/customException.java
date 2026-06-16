package practise;

import java.util.Scanner;

public class customException {
    public static void main(String[] args) {
        for(String s:args){
            System.out.println(s);
        }
        
        try{
             int a;
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter a number: ");
             a = sc.nextInt();
             if(a==0)
             {
                 throw new MyCustomException("a can't be zero");
            }

            
             
        }   
        catch(MyCustomException e){
            System.out.println(e);
        }
    }
}


class MyCustomException extends Exception{
    public MyCustomException(String message){
          super(message);
    }
}
