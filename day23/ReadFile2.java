package day23;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile2 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("Java.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
           System.out.println("Exception Occured");
           System.out.println(e.getMessage());
        }

    }
}
