package practiset01;

public class javapractise60 {
   public static void main(String[] args)  throws InterruptedException{
     
       Thread t1 = new Thread(()->{
          while(!Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName());
          }

          System.out.println(Thread.currentThread().isInterrupted());
          System.out.println(Thread.interrupted());
          System.out.println(Thread.currentThread().isInterrupted());


       });

       t1.start();
       Thread.sleep(300);
       t1.interrupt();

   }    
}
