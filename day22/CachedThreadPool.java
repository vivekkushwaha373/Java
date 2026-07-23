package day22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();

        for(int i=0;i<10;i++){
            executor.execute(()->{
                System.out.println(Thread.currentThread().getName()+ " Excuted");
            });
        }

        executor.shutdown();
    }
}
