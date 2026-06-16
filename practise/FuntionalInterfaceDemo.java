package practise;


interface testingInterface{
    int greet(int a,int b); // can only have one abstract method 
    static int addnum(int a,int b){
        return a+b;
    }
    default int addnum2(int a,int b){
        return a+b;
    }
}
public class FuntionalInterfaceDemo {
    public static void main(String[] args) {
         testingInterface ob = (int a,int b) -> a+b;  // this is lambda expression
        //  testingInterface ob = new testingInterface() {
        //     @Override
        //     public int greet(int a,int b){
        //         return a+b;
        //     }
        //  };
        testingInterface ob2 = (a,b) -> a+b;
         int a=3;
         int b=6;
         int ans = ob.greet(a,b);
         System.out.println(ans);
    }
}


