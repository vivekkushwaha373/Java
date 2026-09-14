package practiset01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class javapractise72 {
   public static void main(String[] args) {
       ExecutorService executor = Executors.newSingleThreadExecutor();
       for(int i=0;i<10;i++){
         executor.execute(()->{
            System.out.println("Hello ji");
       });
       }

       executor.shutdown();
   }   
}
