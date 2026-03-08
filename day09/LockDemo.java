package day09;

import java.util.concurrent.locks.ReentrantLock;

import javax.management.RuntimeErrorException;

public class LockDemo {

    private int balance = 1000;

    // reentrantLock implements lock
    private final ReentrantLock rl = new ReentrantLock();

    public void withdraw(int amount){
       rl.lock();

       try{
         
        if(balance>=amount){
            Thread.sleep(2000);
             balance-=amount;
             System.out.println("Withdrawn: "+amount+" remaining: "+balance);
        }
         
       }catch(InterruptedException e){
          throw new RuntimeException(e);
       }finally{
        rl.unlock();
       }
    }
    
}
