package practiset01;

import java.util.concurrent.atomic.AtomicInteger;

public class javapractise70 {
    public static void main(String[] args) {
        Increment cnt = new Increment();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
                cnt.increment();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
                cnt.increment();
        });

        t1.start();
        t2.start();
        try{
        t1.join();
        t2.join();
        }catch(Exception e){}

        System.out.println(cnt.getval());
    }
}

class Increment {
    AtomicInteger count = new AtomicInteger();

    void increment() {
        // count.getAndIncrement();

        while(true){
              int expectedValue = count.get();
              int newvalue = expectedValue +1;

              if(count.compareAndSet(expectedValue, newvalue)){
                 return ;
              }

        }
        
    }

    int getval(){
        return count.get();
    }

}
