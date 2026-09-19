package day07;

public class CustomErrorHandling {
    
    public static int divideBy(int a,int b)throws CustomExceptionDemo{
         if(b==0){
            throw new CustomExceptionDemo("Dividdent: Cannot be zero");
         
         }
         return a/b;
    }  
    public static void main(String[] args) {
        try{

            int ans = divideBy(12,0);
            System.out.println(ans);
        }catch(CustomExceptionDemo error){
           System.out.println(error.getCustomErrorMessage());
        }
    }
}
