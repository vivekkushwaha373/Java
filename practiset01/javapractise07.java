package practiset01;

public class javapractise07 {

    static int rollno(int num) {
        switch (num) {
            case 1: 
                System.out.println("Case1: The number was: " + num);
                return num;
            
            case 2: 
                System.out.println("Case2: The number was: " + num);
                return num;
            
            case 3: 
                System.out.println("Case3: The number was: " + num);
                return num;
            
            default: 
               System.out.println("Default Case: The number was default: "+num);  
               return num;
            
        }
    }

    public static void main(String[] args) {
          int ans = rollno((int)(Math.random()*10)%4);
        //   System.out.println(ans);
    }
}