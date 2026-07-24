package day22;

import java.util.concurrent.CompletableFuture;

public class completablefuturedemo03 {
    public static void main(String[] args) {
        CompletableFuture<Integer> fA = CompletableFuture.supplyAsync(()->10);
        CompletableFuture<Integer> fB = CompletableFuture.supplyAsync(()->20);
        CompletableFuture<Integer> fC = fA.thenCombine(fB, (a,b)->{
            return a+b;
        });

        System.out.println(fC.join());


    }
}
