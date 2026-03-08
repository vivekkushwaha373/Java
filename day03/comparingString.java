package day03;

public class comparingString {
    public static void main(String[] args) {
        String name1 = "vivek";
        String name2 = "vivek";

        //what compareto returns

        //1 s1 > s2 // +ve
        //2 s1 == s2 // 0
        //3 s1 < s2 // -ve

        
        //name1.compareTo(name2) == 0 u could have used this as well for value comparison

        //here we are comparing value
        if(name1.equals(name2)){
             System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
 
        //here we are comparing reference
        if(name1==name2){
             System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
