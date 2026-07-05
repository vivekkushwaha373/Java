package day22;

public class thread04 {
   public static void main(String[] args) {
    Thread t1 = new Thread(()->System.out.println("Current thread is: "+ Thread.currentThread().getName()));
    t1.start();
    // t1.run();
   } 
}


// what is you will call t1.run() durectly 
// Yes but it will not create a thread and run the code within runnabe interface using main thread only

// Note: .start() method is require to create a thread
// it does 2 job create a thread and run the runnable interface run
