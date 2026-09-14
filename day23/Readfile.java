package day23;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readfile {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Java.txt");
       
        int ch;
        while((ch=reader.read())!=-1){
            System.out.print((char)ch);
        }
        // BufferedInputStream 


        
    }
}
