package day08;

class ThreadDemo extends Thread{

    @Override
    public void run(){
       for(int i=0;i<5;i++)
       {
          System.out.println("child thread executing");
       }
    }
}

public class ThreadTest {
    public static void main(){

        ThreadDemo t1 = new ThreadDemo();
        t1.start();
        for(int j=0;j<5;j++){
            System.out.println("Main Thread is being Executed");
        }
    }
}

/*
---> H.W Thread Schedular

start() --> a new thread is created and this new thread is responsible for executing the run() method
 run()  on the other hand if we use run(), no new thread is created instead the run() method is executed like
 a regular method

 if we directly use t1.tun() then it will be executed by main thread not child thread

 run in THred is an empty funtion like run(){}
 

*/