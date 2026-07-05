package day22;


class threadDemo{
  public static void main(String[] args) {
     MyThread t1 = new MyThread(); // here t1 is a thread
     t1.start();
  }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Hello ji this is love babber");
    }
}

/*
t1.start() : JVM asks OS to create a new Thread  --> Thread gets Stack/PC space 
Thread execute run()

*/