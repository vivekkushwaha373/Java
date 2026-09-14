package day22;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

//CAS compare and set

public class AtomicReferencewithRetry {
    public static void main(String[] args) {
        Seat st = new Seat();
        Thread t1 = new Thread(()->{
           for(int i=0;i<1000;i++)
           st.incrementCount();
        });
        Thread t2 = new Thread(()->{
            for(int i=0;i<1000;i++)
            st.incrementCount();

        });

        t1.start();
        t2.start();

        try{
           Thread.sleep(2000);
        }catch(Exception e){

        }
        
        System.out.println("Incresed count to: "+ st.counter.get());

    }

}

class Seat {

    // AtomicReference<Integer> counter = new AtomicReference<>(0);
    AtomicInteger counter = new AtomicInteger();

    void incrementCount() {
        // counter.incrementAndGet();
        while (true) {

           Integer expectedValue = counter.get();
           Integer newvalue = expectedValue + 1;
            

            if (counter.compareAndSet(expectedValue, newvalue) == true) {
                return;

            }
           

        }


    }

}