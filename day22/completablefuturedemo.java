package day22;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class completablefuturedemo {
    public static void main(String[] args) {
        Mysupplier task = new Mysupplier();
        // Supplier<Integer> task = ()->{
        //     return 10;
        // };
        // completable future by default uses forkjoin Pool u can also give your own executor If u don't want it to usefork joihn
        // u can also give your own executor

        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(task).thenApply(value->value*2);

        CompletableFuture<Void> future2 = CompletableFuture.supplyAsync(task).thenApply(value->value*2).thenAccept(System.out::println);

        CompletableFuture<Void> future3 = CompletableFuture.supplyAsync(task).thenApply(value->value*2).thenAccept(System.out::println).thenRun(()->{
            System.out.println("Done");
        });

        
     
        // System.out.println(future.join()); // this is unchecked exception with completable futurw
        try{
            System.out.println(future1.get());  // this will give unchecked exception

        }catch(Exception e){}

    }
}


// isDONE
// get
// join
// cancel
// isCancelled


class Mysupplier implements Supplier<Integer>{
    public Integer get(){
        return 10;
    }
}