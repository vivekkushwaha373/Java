package practiset01;
// volatile / visibility problem to remove
public class javapractise61 {
    volatile static boolean cnt = false;
    public static void main(String[] args) {
       Thread t1 = new Thread(()->{
           while(cnt==false){
            //   System.out.println("I am still false");
           }
           System.out.println("Loop is completed");   
       });

       Thread t2 = new Thread(()->{
        try{

            Thread.sleep(400);
        }  catch(Exception e){}
          cnt = true;
       });


       t1.start();
       t2.start();

    }   
}
