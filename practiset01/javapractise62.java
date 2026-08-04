package practiset01;

public class javapractise62 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            try{
               Thread.sleep(400);
            }catch(Exception e){}

            System.out.println("Say Hello");
        });

        System.out.println(t1.isAlive());  //false  
        t1.start();  
        System.out.println(t1.isAlive());   // true and false
        try{

           Thread.sleep(500);
        }catch(InterruptedException e){}
        System.out.println(t1.isAlive());

    }
}
