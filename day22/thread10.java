package day22;

public class thread10 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            while(!Thread.currentThread().isInterrupted()){
                System.out.println("running");
            }
        });

        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
/*
  interrupt method 
  Thread --> interrupt flag  (default false) 

  t1.interrupt() --> it sends a singnal to t1 thread that t1 shoul stop doing what it is doing

  We can gracefully handle
  ---> You can make a thread run until a condition
  ---> Cancelling a long running task
  ---> Used to stop our Thread Pool 

  isInterrupted() --> returns interrupt flag value (T/F)
  interrupted()--> return interrupt flag value (T/F) but also set it back to false

  --> sleep(), join(), wait() : TIMED_WAITING, WAITING --> interrupt() on calling interrupt you wil 
  get interrupt exception

*/