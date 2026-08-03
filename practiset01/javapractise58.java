package practiset01;

public class javapractise58 {
    public static void main(String[] args) throws InterruptedException {
        Thread MainThread = Thread.currentThread();

        Thread t1 = new Thread(() -> {
            System.out.println("Main Thread Ruko pehle");
            System.out.println(MainThread.getState());
            try{

                Thread.sleep(300);
            }catch(Exception e){

            }
            System.out.println("Ab Continue Karlo");
        });

        t1.start();

        t1.join();

        System.out.println(t1.getState());

        System.out.println("Main Thread is finally completed");

    }
}
