package practise;

public class MoreonException {

    static int returnint(int num) throws ArithmeticException {
         int arr[] ={1,2,3};
         return num+arr[9] / 0;

    }

    public static void main(String[] args) {
        try {
            int a = returnint(2);
        } catch (ArithmeticException| ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Occured");
        }
    }
}
