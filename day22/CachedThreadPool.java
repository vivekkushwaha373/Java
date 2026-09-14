package day22;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

Interview definition
/* 

CachedThreadPool is a thread pool that creates new threads on demand, reuses idle threads when available, 
and terminates idle threads after 60 seconds. It uses a SynchronousQueue, so tasks are handed directly
to worker threads instead of being stored in a queue.

 */

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        //Unlimited threads
        //no queues

        for(int i=0;i<10;i++){
            executor.execute(()->{
                System.out.println(Thread.currentThread().getName()+ " Excuted");
            });
        }

        executor.shutdown();
    }
}
