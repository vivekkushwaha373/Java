package day07;
/*                        
Object
 └── Throwable
     ├── Error
     │   ├── VirtualMachineError
     │   │   ├── OutOfMemoryError
     │   │   └── StackOverflowError
     │   ├── AssertionError
     │   ├── LinkageError
     │   │   ├── NoClassDefFoundError
     │   │   └── UnsatisfiedLinkError
     │   └── ExceptionInInitializerError
     │
     └── Exception
         ├── IOException
         │   ├── FileNotFoundException
         │   ├── EOFException
         │   └── InterruptedIOException
         │
         ├── SQLException
         │
         ├── ClassNotFoundException
         │
         ├── InterruptedException
         │
         ├── ParseException
         │
         └── RuntimeException   ← (Unchecked starts here)
             ├── NullPointerException
             ├── ArithmeticException
             ├── ArrayIndexOutOfBoundsException
             ├── StringIndexOutOfBoundsException
             ├── ClassCastException
             ├── IllegalArgumentException
             │   ├── NumberFormatException
             │   └── IllegalStateException
             ├── UnsupportedOperationException
             └── ConcurrentModificationException
*/  
                        
public class exceptionHandling {
    public static void main(String[] args) {
        try{
            System.out.println("Before Risky code");
            System.out.println(10/0);
            System.out.println("After risky code");
        }
        catch(Exception error){
           error.printStackTrace();
           System.out.println(error);
           System.out.println(error.getMessage());
        }
        System.out.println("Hello ji this is vivek Kushwaha");
        System.out.println("Hello ji this is vivek Kushwaha");
        System.out.println("Hello ji this is vivek Kushwaha");
        System.out.println("Hello ji this is vivek Kushwaha");
    }
}
