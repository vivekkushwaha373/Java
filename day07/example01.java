package day07;
// Custom message throwing Demo---> best practise
public class example01 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        int res=-1;
    for(int i=0;i<arr.length ; i++){
        arr[i]=i;
    }

    try{
         res = arr[1]/0;
         // this is what you are throwing Not jvm 
         throw new ArithmeticException("Request failed due to technical Error");
    }
    catch(ArithmeticException error){
        res =100;
        System.out.println(error.getMessage());
    }
    catch(ArrayIndexOutOfBoundsException error){
        
        System.out.println(error.getMessage());
    }
    catch(Exception error){
        System.out.println(error.getMessage());
        
    }
    System.out.println(res); //this will give 100
    }
}
