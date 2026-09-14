package practiset01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.StampedLock;

import day22.stampedeLock;

public class javapractise69 {
    public static void main(String[] args) {

        Student st = new Student();
        Thread r1 = new Thread(() -> {
            st.readrollno();
        });
        Thread r2 = new Thread(() -> {
            st.readrollno();
        });
        Thread r3 = new Thread(() -> {
            st.readrollno();
        });
        Thread w1 = new Thread(() -> {
            st.writeroll(2);
        });
        Thread w2 = new Thread(() -> {
            st.writeroll(3);
        });
        Thread w3 = new Thread(() -> {
            st.writeroll(10);
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
    int roll_no;

    // ReadWriteLock lock = new ReentrantReadWriteLock();
    // Lock r = lock.readLock();
    // Lock w = lock.writeLock();

    StampedLock lock = new StampedLock();

    void readrollno() {
        long stamp = lock.tryOptimisticRead();
        try {

            Thread.sleep(2000);
        } catch (Exception e) {
        }

        if (lock.validate(stamp) == true) {

            System.out.println(Thread.currentThread().getName() + "reads rollnumber " + roll_no);

        } else {
            stamp = lock.readLock();
            try {

                System.out.println(Thread.currentThread().getName() + "reads rollnumber " + roll_no);

            } finally {
                lock.unlock(stamp);
            }

        }

    }

    void writeroll(int val) {
        // w.lock();
        long stamp = lock.writeLock();
        try {

            roll_no = val;
            System.out.println(Thread.currentThread().getName() + "write rollnumber " + val);
            try {

                Thread.sleep(2000);
            } catch (Exception e) {
            }
        } finally {
            lock.unlock(stamp);

        }

    }

}
