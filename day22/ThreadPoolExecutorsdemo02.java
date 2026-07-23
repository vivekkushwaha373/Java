package day22;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecutorsdemo02 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Integer> f1 = executor.submit(()->{
            try{
              Thread.sleep(2000);
            }catch(Exception e){

            }
            return 10;
        });
       
        try{

            System.out.println("Future Result is : " + f1.get());
        }catch(InterruptedException | ExecutionException e ){

        }finally{
            executor.shutdown();
        }


    }
}
