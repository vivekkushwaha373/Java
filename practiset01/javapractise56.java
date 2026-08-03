package practiset01;

class custonRun implements Runnable{
   @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        // No Thread is created main iteself is executing this 
        System.out.println("hello ji");
    }
}

public class javapractise56 {
    public static void main(String[] args) {
        // System.out.println("hii");
      
        custonRun cr = new custonRun();
        cr.run();
                
    }
}


