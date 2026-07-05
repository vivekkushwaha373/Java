package day22;

public class thread02 {
     public static void main(String[] args) {
        // MyRunnable r1 = new MyRunnable(); // here r1 is task 
        // Thread t1 = new Thread(r1);

        Thread t1 = new Thread(()->System.out.println("Thread is running"));
        
        t1.start();
     }
}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}