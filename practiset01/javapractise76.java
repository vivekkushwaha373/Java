package practiset01;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

public class javapractise76 {
  public static void main(String[] args) throws InterruptedException{
    CompletableFuture<Void> future1 = CompletableFuture.runAsync(()->{
       System.out.println("EXecuted by thread "+Thread.currentThread().getName());
    });
    CompletableFuture<Void> future2 = CompletableFuture.runAsync(()->{
       System.out.println("EXecuted by another thread "+Thread.currentThread().getName());
    });
    CompletableFuture<Integer> future3 = CompletableFuture.supplyAsync(()->{
       return 2;
    }).thenApply(x->x*2);
    CompletableFuture<Void> future4 = CompletableFuture.supplyAsync(()->{
       return 2;
    }).thenApply(x->x*2).thenAccept(System.out::println).thenRun(()->{System.out.println("HJJSDJVHDJ");});
    
    // try{
        System.out.println(future3.join());

    // }catch(Exception e){}


  }    
}
