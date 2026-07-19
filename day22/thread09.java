package day22;

public class thread09 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for(int i=0;i<=10;i++){
              System.out.println("TI : "+i);
              Thread.yield();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0;i<=10;i++){
              System.out.println("T2 : "+i);
            }
        });

        t1.start();
        t2.start();
    }
}


/*
Thread.yield() --> I am waiting to give my cpu time to someone else with same priority and that 
wants to run

1. OS can reject this 
2. It is like suggestion to the OS
3. Current Thread does not go to waiting, TIMED_WAITING, BLOCKED,
4. It does go to only RUNNABLE state
5. Not used in production
*/