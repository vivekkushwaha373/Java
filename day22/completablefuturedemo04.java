package day22;

import java.util.concurrent.CompletableFuture;

public class completablefuturedemo04 {
    public static void main(String[] args) {
        CompletableFuture <Integer> future1 = CompletableFuture.supplyAsync(()-> 10/0).exceptionally((ex)->{
            System.out.println("Exception is thrown "+ex.getMessage());
            return -1;
        });

        System.out.println(future1.join());
    }
}
