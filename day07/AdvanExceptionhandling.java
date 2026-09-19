package day07;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

// throws delegates it responsibility to caller funtion 
// this is only applicable for checked Exception
// if u don't apply exception handling, default exception handler takes care of everything
// try can also be worked with finally without catch


class ExceptionTest{

    void print1(){
       
        try{

             print2();
        }catch(Exception e){
          System.out.println(e.getMessage());
        //   e.printStackTrace();
    
        }finally{
            System.out.println("Handled in print1() funtion");
        }
         System.out.println("print 1");
    }

    void print2()throws FileNotFoundException{
        print3();
        System.out.println("print 2");
    }
    void print3()throws FileNotFoundException{
        print4();
        System.out.println("print 3");
    }

    void print4() throws FileNotFoundException{
        try{

            print5();
        }catch(Exception e){}
        System.out.println("print 4");
     
    }

    void print5() throws FileNotFoundException{

      BufferedReader reader = new BufferedReader(new FileReader("/jhkyu"));
    }

    

}


public class AdvanExceptionhandling {
    public static void main(String[] args) {
        ExceptionTest obj = new ExceptionTest();
        obj.print1();
    }
}
