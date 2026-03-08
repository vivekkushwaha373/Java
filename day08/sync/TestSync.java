package day08.sync;

public class TestSync {
     public static void main(String[] args){
         System.out.println("sync method ----------------");
         TablePrintWithMethod t = new TablePrintWithMethod();
         MyThread t1 = new MyThread(t);
         MyThread t2 = new MyThread(t);

         t1.setName("t1.thread");
         t2.setName("t2.thread");

         t1.start();
         t2.start();

         try{
             System.out.println("Main Thread waiting ... ");
             t1.join();
             t2.join();
             System.out.println("Main thread completed");
         }
         catch(InterruptedException e){
             e.printStackTrace();
         }


     } 
}
