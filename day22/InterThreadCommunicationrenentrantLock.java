package day22;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class InterThreadCommunicationrenentrantLock {
    public static void main(String[] args) {
        Student st = new Student();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
                st.read();
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10; i++)
                st.write("vivek" + i);
        });

        t1.start();
        t2.start();
    }
}

class Student {

    ReentrantLock lock = new ReentrantLock();
    Condition c = lock.newCondition();

    String name;
    boolean flag = true;

    void read() {
        lock.lock();
        try {
            while (flag == true) {
                try {
                    c.await();

                } catch (Exception e) {
                }
            }
            System.out.println("reader reads: " + name);
            name = null;
            flag = true;
            c.signal();

        } finally {
            lock.unlock();
        }
    }

    void write(String name) {
        lock.lock();
        try {
            while (flag == false) {
                try {
                    c.await();

                } catch (Exception e) {
                }
            }

            this.name = name;
            System.out.println("reader Writes: " + name);
            flag = false;
            c.signal();

        } finally {
            lock.unlock();
        }
    }

}