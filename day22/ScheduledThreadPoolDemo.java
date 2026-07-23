package day22;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(3);
        
        // scheduler.schedule(()->{
        //   System.out.println(Thread.currentThread().getName()+" is Being Executed");
        // }, 3, TimeUnit.SECONDS);
        // scheduler.shutdown();


        scheduler.scheduleAtFixedRate(()->{
          System.out.println(Thread.currentThread().getName()+" is Being Executed");
        },2, 3, TimeUnit.SECONDS);

    }
}
