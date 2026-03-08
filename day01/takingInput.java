package day01;
import java.util.Scanner;

public class takingInput {
   //here I am making a static method main inside class takingInput
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //integer input 
        
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        
        //string input
        
        
        System.out.print("Enter your name ");
        String name = sc.next();
        System.out.println("My name is "+name);

        sc.nextLine();  // consume the leftover newline

        //statement input

        System.out.println("What is your Home Address");
        String address =  sc.nextLine();
        System.out.println("My Address is: "+address);


   }   
}
