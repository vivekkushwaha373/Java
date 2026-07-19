package day22;

public class thread14 {
public static void main(String[] args) {
    Thread t1 = new Thread(()->{
        while(true){
            System.out.println("Running...");
        }
    });

    t1.start();
}    
}

/*
   Deamon Threds ---> Background running threads

   Threads --> User Threads, Daemon Threads

*/
