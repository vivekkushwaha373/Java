package day22;


public class thread16 {
    
    static volatile boolean flag = false;
    public static void main(String[] args){

        Thread t1 = new Thread(()->{
            while(flag == false){ // it is reading it from cache

            }
            System.out.println("print T1: ");
        });
         
        Thread t2 = new Thread(()->{
              try{
                Thread.sleep(2000);
              }catch(Exception e){

              }
              flag = true;
        });

        t1.start();
        t2.start();

    }
}


/*
volatile memory
and visibiltity probelm
*/