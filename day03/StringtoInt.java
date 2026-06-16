package day03;

public class StringtoInt {
   public static void main(String[] args) {
     String numberstring = "123";

    //  string to Int
     int value = Integer.parseInt(numberstring);
     System.out.println(value);

     //int to string

     int integer = 12234;
     String inttoString = Integer.toString(integer); //  or use String.valueof() // this can also be done
     System.out.println(inttoString);

     int a= 3;
     String str1 = String.valueOf(a);
     System.out.println(str1);

   }   
}
