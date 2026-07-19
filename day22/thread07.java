package day22;

public class thread07 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starts"); // RUNNABLE STATE
        Thread.sleep(2000);                       // TIME_WAITNG
        System.out.println("Main thread ends");   // RUNNABLE STATE

    }
}
