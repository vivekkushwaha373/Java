package practise;

public class exceptionhandlingjavademo {
   public static void main(String[] args) {
       
       try{
             int arr[] = {1,2,3};
             System.out.println(arr[6]);
             int a = 2/0;
             
       }
       catch(ArithmeticException e){
           System.out.println(e.getMessage());
           System.out.println(e);
           e.printStackTrace();
       }
       catch(RuntimeException error){
           System.out.println("Runtime exception"); 
        //    System.exit(0); // it will prevent finally to run
       }finally{
        int b = 2/0;
         System.out.println("Run finally block");
       }
   } 
}
