package practise;


public class lambdaexpression {
  public static void main(String[] args) {
     Innerlambdaexpression obj = (a,b)->a+b;
     int res = obj.operator(2, 3);
     obj.printkaro(res);   
  }   
}

@FunctionalInterface
interface Innerlambdaexpression {
   int operator(int a,int b);
   default void printkaro(int res){
      System.out.println("The sum is: "+res);
   } 
}
