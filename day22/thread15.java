package day22;
/*
Race condition
*/

public class thread15 {
    public static void main(String[] args) throws InterruptedException {
        counter cnt = new counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                cnt.increment();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                cnt.increment();
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t1.join();

        System.out.println(cnt.count);
    }
}

class counter {

    int count;

    void increment() {
        count++;            //critical section which is shared by multiple threads
    }
}

// atomic operation

/*

atomic
x= 3
student su = new student()

============================

non atomic
x++; 

if(bal >= amt){
   bal-amt
}

*/
