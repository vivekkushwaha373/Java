package day22;

public class Thread12 {
  public static void main(String[] args) {
    Thread t1 = new Thread(()->{
        System.out.println(Thread.currentThread().getName());

    });

    t1.setName("WORKER 1");
    t1.start();
    System.out.println();

  }    
}

/*
   currentThread()-->reference of current runnign thread
*/
