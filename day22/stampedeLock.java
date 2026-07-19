package day22;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

import javax.lang.model.util.ElementScanner14;

public class stampedeLock {
    public static void main(String[] args) {
        Student st = new Student();

        Thread r1 = new Thread(() -> {
            st.read();
        });
        Thread r2 = new Thread(() -> {
            st.read();
        });
        Thread r3 = new Thread(() -> {
            st.read();
        });
        Thread w1 = new Thread(() -> {
            st.write(2);
        });
        Thread w2 = new Thread(() -> {
            st.write(3);
        });
        Thread w3 = new Thread(() -> {
            st.write(4);
        });

        r1.start();
        r2.start();
        r3.start();
        w1.start();
        w2.start();
        w3.start();

    }

}

class Student {
    StampedLock lock = new StampedLock();
   

    int rollno = 0;

    // void read() {
    //     long stamp = lock.readLock();
    //     // r1.lock();
    //     try {
    //         try {
    //             Thread.sleep(1000);
    //         } catch (Exception e) {
    //         }

    //         System.out.println(Thread.currentThread().getName() + "Reads " + rollno);
    //     } finally {
    //        lock.unlockRead(stamp);
    //     }
    // }
    void read() {
        long stamp = lock.tryOptimisticRead();
            try {
                Thread.sleep(500);
            } catch (Exception e) {
            }
      
          
            if(lock.validate(stamp)==false){
                //fallover logic
                stamp = lock.readLock();
                try{
                 System.out.println("FALLOVER: "+Thread.currentThread().getName() + "Reads " + rollno);
                 
                }finally{
                    lock.unlockRead(stamp);
                }
            }
            else
            System.out.println(Thread.currentThread().getName() + "Reads " + rollno);
    } 
    

    void write(int value) {
        long stamp = lock.writeLock();
        try {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            rollno = value;
            System.out.println(Thread.currentThread().getName() + "Writes " + rollno);

        } finally {
           lock.unlockWrite(stamp);
        }
    }

}