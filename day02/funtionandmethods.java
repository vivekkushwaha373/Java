import java.util.Scanner;
public class funtionandmethods {
    public static int sum(int a,int b){
        return a+b;
    }

    public static void printval(String str){
        System.out.println("String is: "+ str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           System.out.print("Enter the first number: ");
           int a= sc.nextInt();
           System.out.print("Enter string: ");
           String str = sc.next();
           System.out.print("Enter the second number: ");
           int b= sc.nextInt();
           int sum = sum(a,b);
           System.out.println("Sum is : "+sum);
           printval(str);

    }


}
