package practiset01;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class javapractise75 {
    public static void main(String[] args) {
        ScheduledExecutorService sceduled = Executors.newScheduledThreadPool(3);

        // sceduled.schedule(()->{
        //     System.out.println("Taks ko schedule karo");
        // }, 2, TimeUnit.SECONDS);

        sceduled.scheduleAtFixedRate(()->{
            System.out.println("Is task ko Execute Karo");
        }, 1, 3, TimeUnit.SECONDS);

        sceduled.shutdown();


    }
}
