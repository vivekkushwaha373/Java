package practiset01;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class javapractise16 {
    
    public static void checkfile() throws FileNotFoundException{
    
        FileReader fr = new FileReader("text.txt"); // this is checked expeption
    }
    public static void main(String[] args)  {
        try{

            checkfile();
        }catch(Exception e){
            System.out.println("File Not Found Exception Detected");
        }
       
    }
}
