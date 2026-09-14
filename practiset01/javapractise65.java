package practiset01;

public class javapractise65 {
    public static void main(String[] args) {
        ProducerConsumer p = new ProducerConsumer();

        Thread t1 = new Thread(()->{
           for(int i=0;i<10;i++){
               try{

                   p.consumer();
               }catch(Exception e){}
           }
        });
        
        Thread t2 = new Thread(()->{
            
            for(int i=0;i<10;i++){
                try{

                    p.producer(i);
                }catch(Exception e){}
            }
        });

        t1.start();
        t2.start();
    }
}                  
   
class ProducerConsumer {
    volatile int var ;
    volatile boolean flag = false;

    synchronized void producer(int var) throws InterruptedException{
       while(flag == true){
         wait();
        
       }
       System.out.println("producer produces: "+var);
       this.var  = var;
       flag  = true;
       notify();
    }

    synchronized int consumer() throws InterruptedException{
        while(flag == false){
            wait();
            // do not consume
            // here it creates busy waiting
        }
        System.out.println("Consumer consumes: "+var);

        flag = false;
        notify();
        return var;
    }

}
