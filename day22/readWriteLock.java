package day22;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class readWriteLock {
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
    ReadWriteLock lock = new ReentrantReadWriteLock();
    Lock r1 = lock.readLock();
    Lock w1 = lock.writeLock();

    int rollno = 0;

    void read() {
        r1.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            System.out.println(Thread.currentThread().getName() + "Reads " + rollno);
        } finally {
            r1.unlock();
        }
    }

    void write(int value) {
        w1.lock();
        try {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }

            rollno = value;
            System.out.println(Thread.currentThread().getName() + "Writes " + rollno);

        } finally {
            w1.unlock();
        }
    }

}