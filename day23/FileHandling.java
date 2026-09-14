package day23;

import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("Java.txt")){
           writer.write("hello ji this is love babber");
           System.out.println("File written successfully");
        }catch (Exception e) {
           System.out.println("Exception Occured");
           System.out.println(e.getMessage());
        }
    
       
       
    }
}
