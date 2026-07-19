package day22;

public class synchrnizedemo01 {
    public static void main(String[] args) {
        
        Test t = new Test();
        
        Thread t1 = new Thread(()->{
                t.m1();
        });
            
        Thread t2 = new Thread(()->{
              t.m2();
              
        });

        t1.start();
        t2.start();
    }

}

class Test {


    synchronized void m1()
    {
        System.out.println("m1 Starts ");
        try {
         Thread.sleep(2000);
        } catch (Exception e) {
            
        }
        System.out.println("m1 Ends ");
        
    }
    
    synchronized void m2()
    {
        System.out.println("m2 strats ");
        try {
            Thread.sleep(2000);

        } catch (Exception e) {

        }
        System.out.println("m2 ends ");
    }
}