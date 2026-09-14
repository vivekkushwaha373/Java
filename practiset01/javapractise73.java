package practiset01;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class javapractise72 {
   public static void main(String[] args) {
       ExecutorService executor = Executors.newSingleThreadExecutor();
      
       List<Callable<Integer>> list = new ArrayList<>(List.of(()->1,()->2,()->3)); 

       try{

        //    List<Future<Integer>> futures = executor.invokeAll(list);
        //    for(Future<Integer> f : futures){
        //     System.out.println(f.get());
        //    }
           Integer future = executor.invokeAny(list);
           System.out.println(future);
       }catch(Exception e){

       }

       executor.shutdown();
   }   
}
