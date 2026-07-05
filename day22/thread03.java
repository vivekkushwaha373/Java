package day22;

public class thread03 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()); //currentThread gives reference of current thread
        // System.out.println(Thread.currentThread().getId());  //this is getId is deprecated and no longer used

        Thread t1 = new Thread(()->{
            System.out.println("Name of my thread: "+Thread.currentThread().getName());
            System.out.println("id of thread 1: " + Thread.currentThread().getId());
        });
        Thread t2 = new Thread(()->{
            System.out.println("Name of my second thread: "+Thread.currentThread().getName());
            System.out.println("id of thread 2: " + Thread.currentThread().getId());
            
        });

        t1.start();
        t2.start();
    }
}
