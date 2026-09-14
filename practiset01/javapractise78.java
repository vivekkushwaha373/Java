package practiset01;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

import day18.comparableInterfacedemo;

public class javapractise78 {
   public static void main(String[] args) {
     CompletableFuture<Integer> funture1 = CompletableFuture.supplyAsync(()->100);
     CompletableFuture<Integer> funture2 = CompletableFuture.supplyAsync(()->200);
     CompletableFuture<Integer> funture3 = funture1.thenCombine(funture2, (a,b)->a+b);
     CompletableFuture<Integer> funture5 = funture1.thenCombine(funture2, (a,b)->a+b).handle((res,error)->{
        if(error==null){
            return res+34;
        }
        else
        {
            System.out.println("Rresult print krlo"+res);
            return -1;
        }
     });
    //  CompletableFuture<Integer> funture5 = funture1.thenCombine(funture2, (a,b)->a+b).whenComplete((result,exception)->{
    //     if(exception == null){
    //         System.out.println("Rresult print krlo"+result);
    //     }
    //     else
    //         System.out.println("exception found"+exception.getMessage());
    //  });
     CompletableFuture<Void> funture4 = funture1.thenCombine(funture2, (a,b)->a+b).thenAccept((nums)->{
        System.out.println("PRINT EXCEPTED VALUE "+nums);
     }).thenRun(()->{
        System.out.println("it's finally executed");
     });

     System.out.println(funture3.join());
     System.out.println(funture5.join());

   }   
}
