package practiset01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class javapractise71 {
   public static void main(String[] args) {
     ExecutorService executor = Executors.newFixedThreadPool(4);
     
     for(int i=0;i<10;i++){
         executor.execute(()->{
            System.out.println(Thread.currentThread().getName()+"executes: "+"This is running via Thread Pool Executor");
         });
         
     }

     Future<Integer> f = executor.submit(()->10);

     try{
        System.out.println(f.get());
     }catch(Exception e){

     }finally{

         executor.shutdown();
     }






   }   
}
