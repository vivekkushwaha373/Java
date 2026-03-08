//final methods and variables take part in inheritance but can not be overided
//final class can not be inherited

public class finalDemo {
    public static void main(String[] args) {
        int a =10;
        a=20;
        System.out.println(a);

        final int b; // this value
        b=30; //can not be changed
        
        System.out.println(b);

    }
}
