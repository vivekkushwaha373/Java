package day22;

import java.util.concurrent.CompletableFuture;

public class completablefuturedemo02 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(()->{
            System.out.println("This is the first task");
        });

        System.out.println(future.join());
        
    }
}
