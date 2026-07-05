package day22;

public class thread06 {
  public static void main(String[] args) {

    Thread MainThread = Thread.currentThread();
    Thread t1 = new Thread(()->{
        System.out.println("Thread t1 state is Running ");
        System.out.println(MainThread.getState());  // this is timed waiting which aquires lock

    });
    // Thread t1 = new Thread(()->System.out.println("Thread t1 state is Running "));
    System.out.println(t1.getState());
    t1.start();
    System.out.println(t1.getState()); // It can be Runnable or Terminate as well 
    try{

        Thread.sleep(2000);
    }catch(Exception e){
        System.out.println(e.printStackTrace());
        System.out.println(e.getMessage());
        System.out.println(e.);
    }

    System.out.println(t1.getState());
  }   
}
