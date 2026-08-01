package practiset01;

import java.util.Scanner;

public class javapractise17 {
    public static void EnterAge(int age) throws InvalidArgument {
        if(age<18){
            throw new InvalidArgument("Age is Less than 18",age);
        }
        else
        {
            System.out.println("Age is "+age);
        }
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter your Age: ");
         int age = sc.nextInt();
         try{
             EnterAge(age);

         }catch(InvalidArgument e){
            System.out.println(e.getMessage());
            System.out.println("Age is "+e.getAge());
         }

    }
}

class InvalidArgument extends Exception{
    int age;
    public InvalidArgument(String msg,int age){
            super(msg);
            this.age=age;
    }

    public int getAge(){
        return age;
    }



}
