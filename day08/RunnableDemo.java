package day08;

/*

Runnable --> interface--> and it has run method
   |
   |
   |
Thread --> class implements Runnable ---> this gives implementation of run as run(){//empty}
   |
   |
   |
Now Eiether we can create a class that extends thread and override run method of THread  or implements runnable directly   
*/
class Myrunnable implements Runnable{
    @Override
    public void run(){
       for(int i=0;i<9;i++){
        System.out.println("hello");
       }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Myrunnable r = new Myrunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
