package practise;

import java.util.Scanner;

public class inputtaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Roll Number please: \n");
        int RollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name \n");
        String name = sc.nextLine();
        System.out.println("This is my rol number: "+ RollNo);
        System.out.println("This is my name: "+ name);
    }
}
