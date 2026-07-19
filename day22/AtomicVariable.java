package day22;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariable {
    public static void main(String[] args) {
        Counter cn = new Counter();
        Thread t1 = new Thread(()->{
            for(int i=1;i<=10000;i++){
               cn.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for(int i=1;i<=10000;i++){
               cn.increment();
            }
        });

        t1.start();
        t2.start();

        try{
          Thread.sleep(2000);
        }catch(Exception e){}

        System.out.println(cn.get());
    }
}

class Counter{
    // int count =0;
    AtomicInteger count  = new AtomicInteger();
    void increment(){
         count.getAndIncrement();
    }

    int get(){
        return count.get();
    }
}

//parallel execution ==== CAS compare and set operation
// Methods in AtomicInterget

/*
 get()    it gives int value
 set()    count.set(4)
 incrementAndGet
 GetAndIncrement
 decrementAndGet
 GetAndFDecrement
 AddandGet
 getandAdd
*/


// we have AtomicLong as well

// AtomicBoolean

