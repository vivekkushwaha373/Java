package practiset01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class javapractise68 {
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

    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock r = lock.readLock();
    Lock w = lock.writeLock();

    void readrollno() {
        r.lock();
        try {

            System.out.println(Thread.currentThread().getName() + "reads rollnumber " + roll_no);
            try {

                Thread.sleep(2000);
            } catch (Exception e) {
            }
        } finally {
            r.unlock();
        }
    }

    void writeroll(int val) {
        w.lock();
        try {

            roll_no = val;
            System.out.println(Thread.currentThread().getName() + "write rollnumber " + val);
            try {

                Thread.sleep(2000);
            } catch (Exception e) {
            }
        } finally {
            w.unlock();
        }

    }

}
