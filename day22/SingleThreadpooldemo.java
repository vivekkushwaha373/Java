package day22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadpooldemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for(int i=0;i<10;i++){
           executor.execute(()->{
            System.out.println(Thread.currentThread().getName()+" is executed");
           });
        }
        executor.shutdown();
    }
}
