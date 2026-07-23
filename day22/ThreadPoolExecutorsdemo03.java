package day22;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorsdemo03 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2, 5, 2, TimeUnit.SECONDS,new ArrayBlockingQueue<>(100));

        for(int i=0;i<10;i++){
            int threadid= i;
            executor.execute(()->{
                System.out.println(Thread.currentThread().getName()+" "+threadid+ " is Excuted curretnly");
            });
        }

        executor.shutdown();

    }
}
