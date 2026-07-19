package day22;

import java.util.concurrent.atomic.AtomicReference;

// Note CompareAndSet is Atomic and is only executes once  and don't retry automatically


public class AtomicReferencedemo {
    public static void main(String[] args) {

        Seat st = new Seat();

        Thread t1 = new Thread(() -> {
            st.allocateseat("Rahul");
        });
        Thread t2 = new Thread(() -> {
            st.allocateseat("Vivek");
        });

        t1.start();

        t2.start();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }

        System.out.println("aLLOCTAED TO: " + st.seat.get());
    }

}

class Seat {

    AtomicReference<String> seat = new AtomicReference<>("EMPTY");

    boolean allocateseat(String value) {
        if (seat.get() != "EMPTY") {
            System.out.println("Can't allocate the seat");
            return false;
        }
        System.out.println(Thread.currentThread().getName() + " Executes with name: " + value);
        boolean b = seat.compareAndSet("EMPTY", value);
        System.out.println(b);
        return b;
    }

}
