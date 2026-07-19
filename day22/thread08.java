package day22;

public class thread08 {
  public static void main(String[] args) throws InterruptedException {
    System.out.println("Main thread starts");
    Thread mainThread = Thread.currentThread();
    Thread t1 = new Thread(()->{
        try{

            Thread.sleep(2000);
            System.out.println(mainThread.getState());
        } catch(Exception e){

        }
        System.out.println("Thread-0- starts");
    });

    t1.start();
    // t1.join();  // let the t1 thread first completes  hence main thread goes in waiting
    t1.join(1000);
    System.out.println("Main thread ends");

  }   
}
// join()
/*
Mian thread --> WAITING
t1 thread ----> RUNNABLE ---> TERMINATED
Main THread --> Waiting ---> RUNNABLE
*/