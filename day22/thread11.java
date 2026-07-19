package day22;

public class thread11 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{
            try{

                Thread.sleep(2000);
            }catch(Exception e){}
        });
        System.out.println(t1.isAlive());

        t1.start();

        System.out.println(t1.isAlive());

        Thread.sleep(3000);

        System.out.println(t1.isAlive());
    }
}

/*
  isAlive() ---> start --> terminate
*/
