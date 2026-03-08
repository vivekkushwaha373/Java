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
        print2();
    }

    void print2(){
        print3();
    }
    void print3(){
       print4();
    }

    void print4(){
       try{

           print5();
       }
       catch(Exception error){
        error.printStackTrace();
       }
       finally{
          System.out.println("Always runs no matter what");
       }
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
