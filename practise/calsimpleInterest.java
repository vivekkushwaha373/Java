package practise;

import java.util.Scanner;

public class calsimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter priciple: ");
        float p = sc.nextFloat();
        System.out.print("Enter Time: ");
        float T =  sc.nextInt();
        System.out.print("Enter Rate: ");
        float R = sc.nextFloat();
        float I = (p*R*T)/100;
        System.out.println("Simple interest is: "+I);
    }
}
