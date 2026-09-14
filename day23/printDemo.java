package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class printDemo{
    
    public static void main(String[] args) throws IOException {
       InputStreamReader istr = new InputStreamReader(System.in);// converts byte stream into character stream
       BufferedReader bf  = new BufferedReader(istr);
       System.out.println(bf.readLine());
       Reader rs = new Reader() {
       Scanner sc = new Scanner(System.in);
        
       };
    }
}