package day01;
import java.util.Scanner;
public class simpleInterest{
    public static void main(String[] args){
        System.out.println("Calculate Simple Interest");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your principle amount: ");
        float principle = sc.nextFloat();
        System.out.print("Enter rate: ");
        float rate = sc.nextFloat();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        float simpleInterest = (principle*rate*year)/100;
        System.out.println("your simple interest is : "+simpleInterest);

    }
}