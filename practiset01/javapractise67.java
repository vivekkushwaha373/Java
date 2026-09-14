package practiset01;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class javapractise67 {
    public static void main(String[] args) {
        Student st = new Student();
       Thread t1 = new Thread(()->{
        st.Lockdemo();

       });
       Thread t2 = new Thread(()->{
        st.Lockdemo();

       });

       t1.setName("alpha");
       t2.setName("Beta");
       t1.start();
       t2.start();
    }
}

class Student{
    Lock lock = new ReentrantLock(true);
    
    void Lockdemo(){
        if(lock.tryLock()==true){

        
            try{
                System.out.println(Thread.currentThread()+"starts");
                try{
    
                    Thread.sleep(1000);
                }catch(Exception e){
    
                }
            }finally{
                System.out.println(Thread.currentThread()+"ends");
                lock.unlock();
            }
        }else
        {
            System.out.println(Thread.currentThread()+ "Attempting lock failure");
        }
    }

}
