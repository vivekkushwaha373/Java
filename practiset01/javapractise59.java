package practiset01;

public class javapractise59 {
    public static void main(String[] args) {
       Thread t1 = new Thread(()->{
            Thread.yield();
            System.out.println(Thread.currentThread().getName());
        });
        
        Thread t2 = new Thread(()->{
            
          System.out.println(Thread.currentThread().getName());
       });
       t1.setPriority(Thread.MIN_PRIORITY);
       t1.setPriority(Thread.MAX_PRIORITY);

       t1.setName("Sunja Thread");
       t2.setName("Ninja Thread");

      
       t1.start();        
       t2.start();
    }
}

